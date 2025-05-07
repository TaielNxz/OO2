package ar.edu.unlp.info.oo2.ejercicio_01_FridayThe13th;

import java.util.List;

public class VoorheesExporter {

	/**
	 * Exporta un único socio en formato JSON, con indentación.
	 */
	private String exportar(Socio socio) {
		String separator = System.lineSeparator();

		return "\t{" + separator +
		       "\t\t\"nombre\": \"" + socio.getNombre() + "\"," + separator +
		       "\t\t\"email\": \"" + socio.getEmail() + "\"," + separator +
		       "\t\t\"legajo\": \"" + socio.getLegajo() + "\"" + separator +
		       "\t}";
	}

	/**
	 * Exporta una lista de socios en formato JSON, con el formato:
	 * [
	 *   { "nombre": ..., "email": ..., "legajo": ... },
	 *   { ... }
	 * ]
	 */
	public String exportar(List<Socio> socios) {
		
		// Si la lista está vacía, retorna una colección vacía
		if (socios.isEmpty()) {
			return "[]";
		}

		String separator = System.lineSeparator();
		StringBuilder buffer = new StringBuilder();

		// Abre la lista JSON
		buffer.append("[").append(separator);

		// Agrega cada socio exportado, separado por comas y saltos de línea
		socios.forEach(socio -> {
			buffer.append(this.exportar(socio))  // JSON individual del socio
			      .append(",")                   // coma de separación
			      .append(separator);            // salto de línea
		});

		// Elimina la última coma y salto de línea innecesarios
		buffer.setLength(buffer.length() - (separator.length() + 1));

		// Cierra la lista JSON
		buffer.append(separator).append("]");

		return buffer.toString();
	}
}
