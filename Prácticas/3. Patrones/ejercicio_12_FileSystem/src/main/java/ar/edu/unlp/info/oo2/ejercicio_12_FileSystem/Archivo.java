package ar.edu.unlp.info.oo2.ejercicio_12_FileSystem;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Archivo extends FileSystem {

	private int tamanio;
	
	public Archivo( String nombre, LocalDate fecha, int tamanio ) {
		super(nombre, fecha);
		this.tamanio = tamanio;
		
	}

	
	public int tamanoTotalOcupado() {
		return this.tamanio;
	}
	
	
	public Archivo archivoMasGrande() {
		return this;
	}


	public Archivo archivoMasNuevo() {
		return this;
	}


	public FileSystem buscar(String nombre) {
		return this.getNombre().equals(nombre) ? this 
											   : null;
	}


	public List<FileSystem> buscarTodos(String nombre) {
		
        List<FileSystem> encontrados = new ArrayList<>();
        
        if ( this.getNombre().equals(nombre) ) {
            encontrados.add(this);
        }
        
        return encontrados;
        
	}
	

	public String listadoDeContenido() {
		return '/' + this.getNombre() + "\n";
	}

	
}
