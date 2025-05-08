package ar.edu.unlp.info.oo2.ejercicio_12_FileSystem;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public class Directorio extends FileSystem {

	private List<FileSystem> files;
	
	public Directorio(String nombre, LocalDate fecha) {
		super(nombre, fecha);
		this.files = new ArrayList<FileSystem>();
	}
	
	public List<FileSystem> getFiles() {
		return this.files;
	}
	
	public void agregar(FileSystem archivo) {
		this.files.add(archivo);	
	}

	public int tamanoTotalOcupado() {
		return 32 + (this.files.stream().mapToInt( f -> f.tamanoTotalOcupado() ).sum());
	}


	public Archivo archivoMasGrande() {
		return (Archivo) this.files.stream()
				.map( file -> file.archivoMasGrande() )
				.max( (f1 , f2) -> Integer.compare(f1.tamanoTotalOcupado() , f2.tamanoTotalOcupado()) )
				.orElse(null);
	}

	public Archivo archivoMasNuevo() {
		return (Archivo) this.files.stream()
				.map( file -> file.archivoMasNuevo() )
				.max( (f1 , f2) -> f1.getFecha().compareTo(f2.getFecha()) )
				.orElse(null);
	}


	public FileSystem buscar( String nombre ) {
		
	    if ( this.getNombre().equals(nombre) ) {
	        return this;
	    } else {
	        // Recorrer todos los archivos dentro de este FileSystem
	        for (FileSystem file : this.files ) {
	        	
	            // Buscar recursivamente en cada archivo
	            FileSystem encontrado = file.buscar(nombre);
	            
	            // Si se encuentra el nombre en algún nivel del sistema de archivos, retornarlo
	            if (encontrado != null) {
	                return encontrado;
	            }
	            
	        }
	        
	        // Si no se encuentra en este nivel ni en ninguno de sus subniveles, retornar null
	        return null;
	    }
	    
	}


	public List<FileSystem> buscarTodos(String nombre) {
		
		List<FileSystem> encontrados = new ArrayList<>();
		
		// Chusmear si hay que agregar al propio directorio
		if (this.getNombre().equals(nombre)) {
		    encontrados.add(this);
		}

        // Buscar recursivamente en los subdirectorios
        for ( FileSystem file : this.files ) {
            encontrados.addAll(file.buscarTodos(nombre));
        }

        return encontrados;
	}

	@Override
	protected String listadoDeContenido(String pathBase) {
		
	    StringBuilder contenido = new StringBuilder();
	    
	    String currentPath = pathBase + "/" + this.getNombre();
	    contenido.append(currentPath).append("\n");
	    
	    for (FileSystem fs : this.files) {
	        contenido.append(fs.listadoDeContenido(currentPath));
	    }
	    
	    return contenido.toString();
	}

}
