package ar.edu.unlp.info.oo2.ejercicio_14_AccesoALaBaseDeDatos;

import java.util.Collection;
import java.util.List;

public class DatabaseProxy implements DatabaseAccess {
	
	
	private DatabaseAccess database;
	private String password;
	private boolean isLog;
	
	
	public DatabaseProxy ( DatabaseAccess database , String password ) {
		this.database = database;
		this.password = password;
		this.isLog = false;
	}

	
	public void logIn ( String password ) {
		
		if ( this.isLog ) {
			throw new RuntimeException("There is already an open session"); 
		}
		
		if ( password == null || !this.password.equals(password) ) {
			throw new RuntimeException("Incorrect password"); 
		}
		
		this.isLog = true;
		
	}
	
	
	public void logOut() {
		this.isLog = false;
	}
	
	
	 /**
	 * Realiza la inserción de nueva información en la base de datos y
	 * retorna el id que recibe la nueva inserción
	 *
	 * @param rowData
	 * @return
	 */
	public int insertNewRow( List<String> rowData ) {
		
		if ( !this.isLog ) {
			throw new RuntimeException("access denied, please log in first"); 
		}
		
		if ( rowData == null || rowData.isEmpty() ) {
            throw new IllegalArgumentException("Row data cannot be null or empty");
        }
		
		return this.database.insertNewRow(rowData);

	}
	
	
	 /**
	 * Retorna una colección de acuerdo al texto que posee "queryString"
	 *
	 * @param queryString
	 * @return
	 */
	public Collection<String> getSearchResults( String queryString ) {
		
		if ( !this.isLog ) {
			throw new RuntimeException("access denied, please log in first"); 
		}
		
        if ( queryString == null || queryString.trim().isEmpty() ) {
            throw new IllegalArgumentException("Query string cannot be null or empty");
        }
        
		return this.database.getSearchResults(queryString);

	}

}