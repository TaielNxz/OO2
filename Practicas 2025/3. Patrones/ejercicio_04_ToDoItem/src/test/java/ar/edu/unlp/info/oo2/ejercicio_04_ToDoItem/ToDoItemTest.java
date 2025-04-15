package ar.edu.unlp.info.oo2.ejercicio_04_ToDoItem;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDateTime;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ToDoItemTest {

	private ToDoItem tareaPending;
	private ToDoItem tareaInProgress;
	private ToDoItem tareaPaused;
	private ToDoItem tareaFinished;
	
	@BeforeEach
	void setUp() throws Exception {
		
		// Tarea 1 - Pending
		this.tareaPending = new ToDoItem("tarea 1");
		
		// Tarea 2 - InProgress
		this.tareaInProgress = new ToDoItem("tarea 2");
		this.tareaInProgress.start();
		
		// Tarea 3 - Paused
		this.tareaPaused = new ToDoItem("tarea 3");
		this.tareaPaused.start();
		this.tareaPaused.togglePause();;
		
		// Tarea 4 - Finished
		this.tareaFinished = new ToDoItem("tarea 4");
		this.tareaFinished.start();
		this.tareaFinished.finish();
	}

	
	@Test
	void testStart() {
		
		// Si se encuentra en "Pending" deberia cambiar a "InProgress"
		assertTrue( this.tareaPending.getState() instanceof Pending );
		this.tareaPending.start();
		assertTrue( this.tareaPending.getState() instanceof InProgress );
		
		// Si se encuentra en "InProgress" no deberia hacer nada
		assertTrue( this.tareaInProgress.getState() instanceof InProgress );
		this.tareaInProgress.start();
		assertTrue( this.tareaInProgress.getState() instanceof InProgress );
		
		// Si se encuentra en "Paused" no deberia hacer nada
		assertTrue( this.tareaPaused.getState() instanceof Paused );
		this.tareaPaused.start();
		assertTrue( this.tareaPaused.getState() instanceof Paused );
		
		// Si se encuentra en "Finished" no deberia hacer nada
		assertTrue( this.tareaFinished.getState() instanceof Finished );
		this.tareaFinished.start();
		assertTrue( this.tareaFinished.getState() instanceof Finished );
		
	}
	
	
	@Test
	void testTogglePause() {
		
		// Si se encuentra en "Pending" deberia generar un error
		RuntimeException exceptionPending = assertThrows(RuntimeException.class, () -> {
            this.tareaPending.togglePause();
        });
        String expectedErrorMessagePending = "ERROR: no puedes pausar o reanudar una tarea que aun no ha iniciado [ state:'Pending' ]";
        assertEquals(expectedErrorMessagePending, exceptionPending.getMessage());
		
        // Si se encuentra en "InProgress" deberia cambiar a "Paused"
		assertTrue( this.tareaInProgress.getState() instanceof InProgress );
		this.tareaInProgress.togglePause();
		assertTrue( this.tareaInProgress.getState() instanceof Paused );
        
		
		// Si se encuentra en "Paused" deberia cambiar a "InProgress"
		assertTrue( this.tareaPaused.getState() instanceof Paused );
		this.tareaPaused.togglePause();
		assertTrue( this.tareaPaused.getState() instanceof InProgress );
		
		
		// Si se encuentra en "Finished" deberia generar un error
		RuntimeException exceptionFinished = assertThrows(RuntimeException.class, () -> {
            this.tareaFinished.togglePause();
        });
        String expectedErrorMessageFinished = "ERROR: no puedes pausar o reanudar una tarea finalizada [ state:'Finished' ]";
        assertEquals(expectedErrorMessageFinished, exceptionFinished.getMessage());
		
	}
	
	@Test
	void testFinish() {
		
		// Si se encuentra en "Pending" no deberia hacer nada
		assertTrue( this.tareaPending.getState() instanceof Pending );
		this.tareaPending.finish();
		assertTrue( this.tareaPending.getState() instanceof Pending );
		
		// Si se encuentra en "InProgress" deberia cambiar a "Finished"
		assertTrue( this.tareaInProgress.getState() instanceof InProgress );
		this.tareaInProgress.finish();
		assertTrue( this.tareaInProgress.getState() instanceof Finished );
		
		// Si se encuentra en "Paused" deberia cambiar a "Finished"
		assertTrue( this.tareaPaused.getState() instanceof Paused );
		this.tareaPaused.finish();
		assertTrue( this.tareaPaused.getState() instanceof Finished );
		
		
		// Si se encuentra en "Finished" no deberia hacer nada
		assertTrue( this.tareaFinished.getState() instanceof Finished );
		this.tareaFinished.finish();
		assertTrue( this.tareaFinished.getState() instanceof Finished );
		
	}
	
	@Test
	void testWorkedTime() {
		
        LocalDateTime startDate = LocalDateTime.now().minusHours(1);
        LocalDateTime endDate = LocalDateTime.now();
        
        // Si se encuentra en "Pending" deberia generar un error
        RuntimeException exceptionPending = assertThrows(RuntimeException.class, () -> {
        	this.tareaPending.workedTime();
        });
        String expectedErrorMessagePending = "ERROR: No puedes obtener la duracionde una tarea que aun no a iniciado [ state:'Pending' ]";
        assertEquals(expectedErrorMessagePending, exceptionPending.getMessage());
		
        // Si se encuentra en "InProgress" deberia devolver el tiempo trascurrido
		this.tareaInProgress.setStartDate(startDate);
		this.tareaInProgress.setEndDate(endDate);
		assertEquals( 3600 , this.tareaInProgress.workedTime().getSeconds() );
		
		// Si se encuentra en "Paused" deberia devolver el tiempo trascurrido
		this.tareaPaused.setStartDate(startDate);
		this.tareaPaused.setEndDate(endDate);
		assertEquals( 3600 , this.tareaPaused.workedTime().getSeconds() );

		
		// Si se encuentra en "Finished" deberia devolver el tiempo trascurrido
		this.tareaFinished.setStartDate(startDate);
		this.tareaFinished.setEndDate(endDate);
		assertEquals( 3600 , this.tareaFinished.workedTime().getSeconds() );
		
	}
	
	
	@Test
	void testAddComment() {

		// Si se encuentra en "Pending" deberia devolver el comentario
    	this.tareaPending.addComment("Pending comentario");
    	assertEquals( "Pending comentario" , this.tareaPending.getCommentaries().get(0) );
  
    	// Si se encuentra en "InProgress" deberia devolver el comentario
    	this.tareaInProgress.addComment("InProgress comentario");
    	assertEquals( "InProgress comentario" , this.tareaInProgress.getCommentaries().get(0) );
		
    	// Si se encuentra en "Paused" deberia devolver el comentario
    	this.tareaPaused.addComment("Paused comentario");
    	assertEquals( "Paused comentario" , this.tareaPaused.getCommentaries().get(0) );
		
    	// Si se encuentra en "Finished" deberia devolver un error
    	RuntimeException exception = assertThrows(RuntimeException.class, () -> {
        	this.tareaFinished.addComment("Finished comentario");
        });
        String expectedErrorMessage = "ERROR: no puedes agregar un comentario a una tarea finalizada [ state:'Finished' ]";
        assertEquals(expectedErrorMessage, exception.getMessage());

	}
	

}
