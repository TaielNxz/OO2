package ar.edu.unlp.info.oo2.ejercicio_12_FileSystem;

import static org.junit.jupiter.api.Assertions.*;
import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FileSystemTest {

	private Directorio dirVacio;
 	private Directorio dirArchivos;
 	private Directorio dirGrande;
 	private Directorio dirMuyGrande;
 	private Archivo arch1;
 	private Archivo arch2;
	
 	@BeforeEach
	void setUp() throws Exception {
 		
 		dirVacio = new Directorio( "DirectorioVacio" , LocalDate.now() );
		dirArchivos = new Directorio( "DirectorioConArchivos" , LocalDate.now() );
		dirGrande = new Directorio( "DirectorioGrande" , LocalDate.now() ); 
		dirMuyGrande = new Directorio( "DirectorioMuyGrande" , LocalDate.now() ); 
		
		arch1 = new Archivo( "Archivo1" , LocalDate.now() , 100 );
		arch2 = new Archivo( "Archivo2" , LocalDate.now() , 200 );
		
		// 100 + 200 + 32 = 332
		dirArchivos.agregar( arch1 );
		dirArchivos.agregar( arch2 );
		
		// 100 + 200 + 332 = 664
		dirGrande.agregar( arch1 );
		dirGrande.agregar( arch2 );
		dirGrande.agregar( dirArchivos );
		
		// 100 + 200 + 332 + 664 + 32 = 1328
		dirMuyGrande.agregar( arch1 );
		dirMuyGrande.agregar( arch2 );
		dirMuyGrande.agregar( dirArchivos );
		dirMuyGrande.agregar( dirGrande ); // 664
	
	}

 	
	@Test
	void testTamanoTotalOcupado() {
		assertEquals( 32 , dirVacio.tamanoTotalOcupado() );
		assertEquals( 332 , dirArchivos.tamanoTotalOcupado() );
		assertEquals( 664 , dirGrande.tamanoTotalOcupado() );
		assertEquals( 1328 , dirMuyGrande.tamanoTotalOcupado() );
	}
	
	
	@Test
	void testArchivoMasGrande() {
		assertNull( dirVacio.archivoMasGrande() );
		assertEquals( "Archivo2" , dirArchivos.archivoMasGrande().getNombre() );
		assertEquals( "Archivo2" , dirGrande.archivoMasGrande().getNombre() );
		assertEquals( "Archivo2" , dirMuyGrande.archivoMasGrande().getNombre() );
	}
	
	
	@Test
	void testArchivoMasNuevo() {
		assertNull( dirVacio.archivoMasNuevo() );
		assertEquals( "Archivo1" , dirArchivos.archivoMasNuevo().getNombre() );
		assertEquals( "Archivo1" , dirGrande.archivoMasNuevo().getNombre() );
		assertEquals( "Archivo1" , dirMuyGrande.archivoMasNuevo().getNombre() );
	}
	
	
	@Test
	void testBuscar() {
	    assertNull(dirVacio.buscar("Archivo1"));
	    assertEquals("Archivo1", dirArchivos.buscar("Archivo1").getNombre());
	    assertEquals("DirectorioConArchivos", dirGrande.buscar("DirectorioConArchivos").getNombre());
	    
	    // Caso con subdirectorios
	    Directorio dirNivel1 = new Directorio("aux", LocalDate.now());
	    Directorio dirNivel2 = new Directorio("aux2", LocalDate.now());
	    dirNivel2.agregar(new Archivo("re escondido", LocalDate.now(), 1));
	    dirNivel1.agregar(dirNivel2);
	    
	    assertEquals("re escondido", dirNivel1.buscar("re escondido").getNombre());
	}
	
	
	@Test
	void testBuscarTodos() {
	    // Verificar si la búsqueda por nombre retorna los archivos correctos en los directorios.
	    assertTrue(dirVacio.buscarTodos("Archivo1").isEmpty());
	    assertEquals(1, dirArchivos.buscarTodos("Archivo1").size());
	    assertEquals(1, dirArchivos.buscarTodos("Archivo2").size());
	    assertEquals(2, dirGrande.buscarTodos("Archivo2").size());
	    assertEquals(4, dirMuyGrande.buscarTodos("Archivo2").size());
	}
	
	
	@Test
	void testListadoDeContenido() {
	    // Esperamos que el listado de contenido tenga las rutas completas de los directorios y archivos.
	    String esperadoDirArchivos = 
	        "/DirectorioConArchivos\n" + 
	        "/DirectorioConArchivos/Archivo1\n" + 
	        "/DirectorioConArchivos/Archivo2\n";

	    String esperadoDirGrande = 
	        "/DirectorioGrande\n" + 
	        "/DirectorioGrande/Archivo1\n" + 
	        "/DirectorioGrande/Archivo2\n" + 
	        "/DirectorioGrande/DirectorioConArchivos\n" + 
	        "/DirectorioGrande/DirectorioConArchivos/Archivo1\n" + 
	        "/DirectorioGrande/DirectorioConArchivos/Archivo2\n";

	    String esperadoDirMuyGrande = 
	        "/DirectorioMuyGrande\n" + 
	        "/DirectorioMuyGrande/Archivo1\n" + 
	        "/DirectorioMuyGrande/Archivo2\n" + 
	        "/DirectorioMuyGrande/DirectorioConArchivos\n" + 
	        "/DirectorioMuyGrande/DirectorioConArchivos/Archivo1\n" + 
	        "/DirectorioMuyGrande/DirectorioConArchivos/Archivo2\n" + 
	        "/DirectorioMuyGrande/DirectorioGrande\n" + 
	        "/DirectorioMuyGrande/DirectorioGrande/Archivo1\n" + 
	        "/DirectorioMuyGrande/DirectorioGrande/Archivo2\n" + 
	        "/DirectorioMuyGrande/DirectorioGrande/DirectorioConArchivos\n" + 
	        "/DirectorioMuyGrande/DirectorioGrande/DirectorioConArchivos/Archivo1\n" + 
	        "/DirectorioMuyGrande/DirectorioGrande/DirectorioConArchivos/Archivo2\n";
	    
	    // Verificar la salida
	    assertEquals(esperadoDirArchivos, dirArchivos.listadoDeContenido(""));
	    assertEquals(esperadoDirGrande, dirGrande.listadoDeContenido(""));
	    assertEquals(esperadoDirMuyGrande, dirMuyGrande.listadoDeContenido(""));
	}
}
