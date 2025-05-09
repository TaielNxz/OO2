package ar.edu.unlp.info.oo2.ejercicio_23_AerolineaRegional;

public class Persona {

	private String nombre;
	private String apellido;
	

	public Persona(String nombre, String apellido) {
		this.nombre = nombre;
		this.apellido = apellido;
	}
	
	public String getNombre() {
		return nombre;
	}

	public String getApellido() {
		return apellido;
	}
	
	/**
	 * Retorna el nombre completo de la persona de la forma apellido, nombre
	 * @return
	 */
	public String getNombreCompleto() {
		return this.getApellido() + ", " + this.getNombre();
	}

}
