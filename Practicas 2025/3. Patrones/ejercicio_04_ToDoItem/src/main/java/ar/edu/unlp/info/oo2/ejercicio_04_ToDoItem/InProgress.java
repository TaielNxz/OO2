package ar.edu.unlp.info.oo2.ejercicio_04_ToDoItem;

import java.time.LocalDateTime;

public class InProgress extends State {

	public InProgress(ToDoItem task) {
		super(task);
	}


	/**
	* Pasa el ToDoItem a in-progress (siempre y cuando su estado actual sea
	* pending, si se encuentra en otro estado, no hace nada)
	*/
	public void start() {}

	
	/**
	* Pasa la tarea a paused si su estado es in-progress, o a in-progress si su
	* estado es paused. Caso contrario (pending o finished) genera un error
	* informando la causa específica del mismo
	*/
	public void togglePause() {
		this.getTask().setState( new Paused(this.getTask()) );
	}


	/**
	* Pasa el ToDoItem a finished (siempre y cuando su estado actual sea 
	* in-progress o pausada, si se encuentra en otro estado, no hace nada)
	*/
	public void finish() {
		this.getTask().setState( new Finished(this.getTask()) );
		this.getTask().setEndDate( LocalDateTime.now() );
	}


	/**
	* Retorna el tiempo que transcurrió desde que se inició la tarea (start)
	* hasta que se finalizó. En caso de que no esté finalizada, el tiempo que
	* haya transcurrido hasta el momento actual. Si la tarea no se inició,
	* genera un error informando la causa específica del mismo.
	*/
	// public Duration workedTime() {}
	 
	 
	/**
	* Agrega un comentario a la tarea siempre y cuando no haya finalizado. Caso
	* contrario no hace nada."
	*/
	// public void addComment(String comment) {}

	
}
