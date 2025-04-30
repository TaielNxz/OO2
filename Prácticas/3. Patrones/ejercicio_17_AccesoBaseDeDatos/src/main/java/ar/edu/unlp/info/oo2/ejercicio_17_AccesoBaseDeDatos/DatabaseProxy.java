package ar.edu.unlp.info.oo2.ejercicio_17_AccesoBaseDeDatos;

import java.util.Collection;
import java.util.List;

public class DatabaseProxy implements DatabaseAccess {
        
    private DatabaseAccess database;
    private String password;
    private boolean isLog;
    
    public DatabaseProxy(DatabaseAccess database, String password) {
        this.database = database;
        this.password = password;
        this.isLog = false;
    }
    
    public void logIn(String password) {
        if (this.isLog) {
            throw new RuntimeException("Ya hay una sesión abierta"); 
        }
        
        if (password == null || !this.password.equals(password)) {
            throw new RuntimeException("Contraseña incorrecta"); 
        }
        
        this.isLog = true;
    }
    
    public void logOut() {
        this.isLog = false;
    }

    @Override
    public int insertNewRow(List<String> rowData) {
        if (!this.isLog) {
            throw new RuntimeException("Acceso denegado, inicie sesión primero"); 
        }
        
        if (rowData == null || rowData.isEmpty()) {
            throw new IllegalArgumentException("Los datos de la fila no pueden ser nulos o vacíos");
        }
        
        return this.database.insertNewRow(rowData);
    }

    @Override
    public Collection<String> getSearchResults(String queryString) {
        if (!this.isLog) {
            throw new RuntimeException("Acceso denegado, inicie sesión primero"); 
        }
        
        if (queryString == null || queryString.trim().isEmpty()) {
            throw new IllegalArgumentException("La consulta no puede ser nula o vacía");
        }
        
        return this.database.getSearchResults(queryString);
    }

    public void closeSession() {
        this.logOut(); // Simplemente llamamos a logOut para cerrar la sesión
    }
    
}