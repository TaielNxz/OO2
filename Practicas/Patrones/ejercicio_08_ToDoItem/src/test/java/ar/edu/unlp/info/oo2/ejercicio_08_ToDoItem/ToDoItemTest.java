package ar.edu.unlp.info.oo2.ejercicio_08_ToDoItem;

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
		this.tareaPending = new ToDoItem("tarea 1");
		
		this.tareaInProgress = new ToDoItem("tarea 2");
		this.tareaInProgress.start();
		
		this.tareaPaused = new ToDoItem("tarea 3");
		this.tareaPaused.start();
		this.tareaPaused.togglePause();;
		
		this.tareaFinished = new ToDoItem("tarea 4");
		this.tareaFinished.start();
		this.tareaFinished.finish();
	}

	
	@Test
	void testStart() {
		
		// Pending
		assertTrue( this.tareaPending.getState() instanceof Pending );
		this.tareaPending.start();
		assertTrue( this.tareaPending.getState() instanceof InProgress );
		
		// InProgress
		assertTrue( this.tareaInProgress.getState() instanceof InProgress );
		this.tareaInProgress.start();
		assertTrue( this.tareaInProgress.getState() instanceof InProgress );
		
		// Paused
		assertTrue( this.tareaPaused.getState() instanceof Paused );
		this.tareaPaused.start();
		assertTrue( this.tareaPaused.getState() instanceof Paused );
		
		// Finished
		assertTrue( this.tareaFinished.getState() instanceof Finished );
		this.tareaFinished.start();
		assertTrue( this.tareaFinished.getState() instanceof Finished );
		
	}
	
	
	@Test
	void testTogglePause() {
		
		// Pending
		RuntimeException exceptionPending = assertThrows(RuntimeException.class, () -> {
            this.tareaPending.togglePause();
        });
        String expectedErrorMessagePending = "ERROR: no puedes pausar o reanudar una tarea que aun no ha iniciado [ state:'Pending' ]";
        assertEquals(expectedErrorMessagePending, exceptionPending.getMessage());
		
		// InProgress
		assertTrue( this.tareaInProgress.getState() instanceof InProgress );
		this.tareaInProgress.togglePause();
		assertTrue( this.tareaInProgress.getState() instanceof Paused );
        
		
		// Paused
		assertTrue( this.tareaPaused.getState() instanceof Paused );
		this.tareaPaused.togglePause();
		assertTrue( this.tareaPaused.getState() instanceof InProgress );
		
		
		// Finished
		RuntimeException exceptionFinished = assertThrows(RuntimeException.class, () -> {
            this.tareaFinished.togglePause();
        });
        String expectedErrorMessageFinished = "ERROR: no puedes pausar o reanudar una tarea finalizada [ state:'Finished' ]";
        assertEquals(expectedErrorMessageFinished, exceptionFinished.getMessage());
		
	}
	
	@Test
	void testFinish() {
		
		// Pending
		assertTrue( this.tareaPending.getState() instanceof Pending );
		this.tareaPending.finish();
		assertTrue( this.tareaPending.getState() instanceof Pending );
		
		// InProgress
		assertTrue( this.tareaInProgress.getState() instanceof InProgress );
		this.tareaInProgress.finish();
		assertTrue( this.tareaInProgress.getState() instanceof Finished );
        
		
		// Paused
		assertTrue( this.tareaPaused.getState() instanceof Paused );
		this.tareaPaused.finish();
		assertTrue( this.tareaPaused.getState() instanceof Finished );
		
		
		// Finished
		assertTrue( this.tareaFinished.getState() instanceof Finished );
		this.tareaFinished.finish();
		assertTrue( this.tareaFinished.getState() instanceof Finished );
		
	}
	
	@Test
	void testWorkedTime() {
		
        LocalDateTime startDate = LocalDateTime.now().minusHours(1);
        LocalDateTime endDate = LocalDateTime.now();
        
		// Pending
        RuntimeException exceptionPending = assertThrows(RuntimeException.class, () -> {
        	this.tareaPending.workedTime();
        });
        String expectedErrorMessagePending = "ERROR: No puedes obtener la duracionde una tarea que aun no a iniciado [ state:'Pending' ]";
        assertEquals(expectedErrorMessagePending, exceptionPending.getMessage());
		
		// InProgress
		this.tareaInProgress.setStartDate(startDate);
		this.tareaInProgress.setEndDate(endDate);
		assertEquals( 3600 , this.tareaInProgress.workedTime().getSeconds() );
		
		// Paused
		this.tareaPaused.setStartDate(startDate);
		this.tareaPaused.setEndDate(endDate);
		assertEquals( 3600 , this.tareaPaused.workedTime().getSeconds() );

		
		// Finished
		this.tareaFinished.setStartDate(startDate);
		this.tareaFinished.setEndDate(endDate);
		assertEquals( 3600 , this.tareaFinished.workedTime().getSeconds() );
		
	}
	
	
	@Test
	void testAddComment() {

		// Pending
    	this.tareaPending.addComment("Pending comentario");
    	assertEquals( "Pending comentario" , this.tareaPending.getCommentaries().get(0) );
  
		// InProgress
    	this.tareaInProgress.addComment("InProgress comentario");
    	assertEquals( "InProgress comentario" , this.tareaInProgress.getCommentaries().get(0) );
		
		// Paused
    	this.tareaPaused.addComment("Paused comentario");
    	assertEquals( "Paused comentario" , this.tareaPaused.getCommentaries().get(0) );
		
		// Finished
    	RuntimeException exception = assertThrows(RuntimeException.class, () -> {
        	this.tareaFinished.addComment("Finished comentario");
        });
        String expectedErrorMessage = "ERROR: no puedes agregar un comentario a una tarea finalizada [ state:'Finished' ]";
        assertEquals(expectedErrorMessage, exception.getMessage());

	}
	

}
