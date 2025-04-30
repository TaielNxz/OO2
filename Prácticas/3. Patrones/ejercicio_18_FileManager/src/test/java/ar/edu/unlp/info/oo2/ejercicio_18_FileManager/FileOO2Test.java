package ar.edu.unlp.info.oo2.ejercicio_18_FileManager;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FileOO2Test {

	private FileOO2 archivo;
	private FileOO2 nombre;
	private FileOO2 extension;
	private FileOO2 tamanio;
	private FileOO2 fechaCreacion;
	private FileOO2 fechaModificacion;
	private FileOO2 permisos;
	
	
	@BeforeEach
	void setUp() throws Exception {
		this.archivo = new File( "un_nombre" , ".txt", 15.5 , LocalDate.of(2000, 1, 1) , LocalDate.of(2000, 1, 1) , "rw-rw-xrw-" );	
	}
	
	
	@Test
	void testPrettyPrintOption1() { 
		
		// ● nombre - extensión
		this.nombre = new AspectNombre(archivo);  
		this.extension = new AspectExtension(nombre);

		
		String expectedString = "========= File data =========\n"
						      + "nombre: un_nombre\n"
						      + "extension: .txt\n";
		
		assertEquals( expectedString , this.extension.prettyPrint() );
	
	}
	 
	 
	@Test
	void testPrettyPrintOption2() { 
		
		// ● nombre - extensión - fecha de creación
		this.nombre = new AspectNombre(archivo);  
		this.extension = new AspectExtension(nombre);
		this.fechaCreacion = new AspectFechaCreacion(extension);
		
		
		String expectedString = "========= File data =========\n"
							  + "nombre: un_nombre\n"
							  + "extension: .txt\n"
							  + "fecha de creacion: 2000-01-01\n";

		assertEquals( expectedString , this.fechaCreacion.prettyPrint() );
	
	}
	
	
	@Test
	void testPrettyPrintOption3() { 
		
		// ● permisos - nombre - extensión - tamaño
		this.permisos = new AspectPermisos(archivo);  
		this.nombre = new AspectNombre (permisos);
		this.extension = new AspectExtension(nombre);
		this.tamanio = new AspectTamanio(extension);
		
		
		String expectedString = "========= File data =========\n"
							  + "permisos: rw-rw-xrw-\n"
							  + "nombre: un_nombre\n"
							  + "extension: .txt\n"
							  + "tamanio: 15.5\n";
		
		assertEquals( expectedString , this.tamanio.prettyPrint() );
	
	}
	
	
	@Test
	void testPrettyPrintOption4() { 
		
		// ● nombre - extension - tamanio - fechaCreacion - fechaModificacion - permisos
		this.nombre = new AspectNombre(archivo);
		this.extension = new AspectExtension(nombre);
		this.tamanio = new AspectTamanio(extension);
		this.fechaCreacion = new AspectFechaCreacion(tamanio);
		this.fechaModificacion = new AspectFechaModificacion(fechaCreacion);
		this.permisos = new AspectPermisos(fechaModificacion);

		
		String expectedString = "========= File data =========\n"
					    	  + "nombre: un_nombre\n"
						 	  + "extension: .txt\n"
							  + "tamanio: 15.5\n"
							  + "fecha de creacion: 2000-01-01\n"
							  + "fecha de modificacion: 2000-01-01\n"
							  + "permisos: rw-rw-xrw-\n";
		
		assertEquals( expectedString , this.permisos.prettyPrint() );
	
	}

}
