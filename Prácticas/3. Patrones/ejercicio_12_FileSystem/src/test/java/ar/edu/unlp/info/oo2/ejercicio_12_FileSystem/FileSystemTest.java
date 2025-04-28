package ar.edu.unlp.info.oo2.ejercicio_12_FileSystem;

import static org.junit.jupiter.api.Assertions.*;
import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FileSystemTest {

	private Directorio dirVacio;
 	private Directorio dirArchivos;
 	private Directorio dirTocho;
 	private Directorio dirTochisimo;
 	private Archivo arch1;
 	private Archivo arch2;
	
 	@BeforeEach
	void setUp() throws Exception {
 		
 		dirVacio = new Directorio( "DirectorioVacio" , LocalDate.now() );
		dirArchivos = new Directorio( "DirectorioConArchivos" , LocalDate.now() );
		dirTocho = new Directorio( "DirectorioTocho" , LocalDate.now() ); 
		dirTochisimo = new Directorio( "DirectorioTochisimo" , LocalDate.now() ); 
		
		arch1 = new Archivo( "Archivo1" , LocalDate.now() , 100 );
		arch2 = new Archivo( "Archivo2" , LocalDate.now() , 200 );
		
		// 100 + 200 + 32 = 332
		dirArchivos.agregar( arch1 );
		dirArchivos.agregar( arch2 );
		
		// 100 + 200 + 332 = 664
		dirTocho.agregar( arch1 );
		dirTocho.agregar( arch2 );
		dirTocho.agregar( dirArchivos );
		
		// 100 + 200 + 332 + 664 + 32 = 1328
		dirTochisimo.agregar( arch1 );
		dirTochisimo.agregar( arch2 );
		dirTochisimo.agregar( dirArchivos );
		dirTochisimo.agregar( dirTocho ); // 664
	
	}

 	
	@Test
	void testTamanoTotalOcupado() {
		assertEquals( 32 , dirVacio.tamanoTotalOcupado() );
		assertEquals( 332 , dirArchivos.tamanoTotalOcupado() );
		assertEquals( 664 , dirTocho.tamanoTotalOcupado() );
		assertEquals( 1328 , dirTochisimo.tamanoTotalOcupado() );
	}
	
	
	@Test
	void testArchivoMasGrande() {
		assertNull( dirVacio.archivoMasGrande() );
		assertEquals( "Archivo2" , dirArchivos.archivoMasGrande().getNombre() );
		assertEquals( "Archivo2" , dirTocho.archivoMasGrande().getNombre() );
		assertEquals( "Archivo2" , dirTochisimo.archivoMasGrande().getNombre() );
	}
	
	
	@Test
	void testArchivoMasNuevo() {
		assertNull( dirVacio.archivoMasNuevo() );
		assertEquals( "Archivo1" , dirArchivos.archivoMasNuevo().getNombre() );
		assertEquals( "Archivo1" , dirTocho.archivoMasNuevo().getNombre() );
		assertEquals( "Archivo1" , dirTochisimo.archivoMasNuevo().getNombre() );
	}
	
	
	@Test
	void testBuscar() {
		assertNull( dirVacio.buscar("Archivo1") );
		assertEquals( "Archivo1" , dirArchivos.buscar("Archivo1").getNombre() );
		assertEquals( "DirectorioConArchivos" , dirTocho.buscar("DirectorioConArchivos").getNombre() );
		
		// nivel1/nivel2/re escondido
		// nivel1/arch
		Directorio dirNivel1 = new Directorio( "aux" , LocalDate.now() );
		Directorio dirNivel2 = new Directorio( "aux2" , LocalDate.now() );
		dirNivel2.agregar( new Archivo( "re escondido" , LocalDate.now() , 1 ) );
		dirNivel1.agregar( dirNivel2 );
		assertEquals( "re escondido" , dirNivel1.buscar("re escondido").getNombre() );
	}
	
	
	@Test
	void testBuscarTodos() {
		assertEquals( true , dirVacio.buscarTodos("Archivo1").isEmpty() );
		assertEquals( 1 , dirArchivos.buscarTodos("Archivo1").size() );
		assertEquals( 1 , dirArchivos.buscarTodos("Archivo2").size() );
		assertEquals( 2 , dirTocho.buscarTodos("Archivo2").size() );
		assertEquals( 2 , dirTocho.buscarTodos("Archivo2").size() );
		assertEquals( 4 , dirTochisimo.buscarTodos("Archivo2").size() );
		assertEquals( 4 , dirTochisimo.buscarTodos("Archivo2").size() );
	}
	
	
	@Test
	void testListadoDeContenido() {
		//System.out.println( dirVacio.listadoDeContenido() );
		System.out.println( dirArchivos.listadoDeContenido() );
		System.out.println();
		System.out.println( dirTocho.listadoDeContenido() );
	}


}
