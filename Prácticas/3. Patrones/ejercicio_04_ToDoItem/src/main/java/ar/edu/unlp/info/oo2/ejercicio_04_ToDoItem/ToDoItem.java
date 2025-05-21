package ar.edu.unlp.info.oo2.ejercicio_04_ToDoItem;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import ar.edu.unlp.info.oo2.ejercicio_04_ToDoItem.state.Pending;
import ar.edu.unlp.info.oo2.ejercicio_04_ToDoItem.state.State;

public class ToDoItem {
	
	private String name;
	private State state;
	private List<String> comments;
	private LocalDateTime startDate;
	private LocalDateTime endDate;
	
	public ToDoItem(String name) {
		this.name = name;
		this.comments = new ArrayList<String>();
		this.state = new Pending(this);
	}
	

	/**
	* Pasa el ToDoItem a in-progress (siempre y cuando su estado actual sea
	* pending, si se encuentra en otro estado, no hace nada)
	*/
	public void start() {
		this.state.start();	
	}

	
	/**
	* Pasa la tarea a paused si su estado es in-progress, o a in-progress si su
	* estado es paused. Caso contrario (pending o finished) genera un error
	* informando la causa específica del mismo
	*/
	public void togglePause() {
		this.state.togglePause();  	
	}


	/**
	* Pasa el ToDoItem a finished (siempre y cuando su estado actual sea 
	* in-progress o pausada, si se encuentra en otro estado, no hace nada)
	*/
	public void finish() {
		this.state.finish();     	
	}


	/**
	* Retorna el tiempo que transcurrió desde que se inició la tarea (start)
	* hasta que se finalizó. En caso de que no esté finalizada, el tiempo que
	* haya transcurrido hasta el momento actual. Si la tarea no se inició,
	* genera un error informando la causa específica del mismo.
	*/
	 public Duration workedTime() { 
    	return this.state.workedTime();
     }
	 
	 
	/**
	* Agrega un comentario a la tarea siempre y cuando no haya finalizado. Caso
	* contrario no hace nada."
	*/
	public void addComment(String comment) {
		this.state.addComment(comment);  	
	}
	
	
	/**
	* Getters y Setters
	*/
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}

	public List<String> getComments() {
		return comments;
	}

	public void setComments(List<String> comments) {
		this.comments = comments;
	}

	public LocalDateTime getStartDate() {
		return startDate;
	}

	public void setStartDate(LocalDateTime startDate) {
		this.startDate = startDate;
	}

	public LocalDateTime getEndDate() {
		return endDate;
	}

	public void setEndDate(LocalDateTime endDate) {
		this.endDate = endDate;
	}
	
}