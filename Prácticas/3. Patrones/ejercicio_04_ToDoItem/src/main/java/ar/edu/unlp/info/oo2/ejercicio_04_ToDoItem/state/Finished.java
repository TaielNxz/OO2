package ar.edu.unlp.info.oo2.ejercicio_04_ToDoItem.state;

import ar.edu.unlp.info.oo2.ejercicio_04_ToDoItem.ToDoItem;

public class Finished extends State {

	public Finished(ToDoItem task) {
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
		throw new RuntimeException("ERROR: no puedes pausar o reanudar una tarea finalizada [ state:'Finished' ]");
	}


	/**
	* Pasa el ToDoItem a finished (siempre y cuando su estado actual sea 
	* in-progress o pausada, si se encuentra en otro estado, no hace nada)
	*/
	public void finish() {}


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
	public void addComment(String comment) {
		throw new RuntimeException("ERROR: no puedes agregar un comentario a una tarea finalizada [ state:'Finished' ]");
	}

	
}
