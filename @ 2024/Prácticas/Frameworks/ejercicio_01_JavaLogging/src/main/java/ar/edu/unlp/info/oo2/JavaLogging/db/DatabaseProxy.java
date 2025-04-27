package ar.edu.unlp.info.oo2.JavaLogging.db;

import java.util.Collection;
import java.util.List;
import java.util.logging.*;

public class DatabaseProxy implements DatabaseAccess{
	
	
	private DatabaseAccess database;
	private boolean isLog;
	
	// Instancia de Logger
	private static Logger logger = Logger.getLogger("DatabaseProxy");
	
	
	public DatabaseProxy (DatabaseAccess database) {
		
		this.database = database;
		this.isLog = false;
		

		/* Configurar el logger
		 * 
		 * 1. ConsoleHandler: 
		 * 		Se crea un manejador de consola (ConsoleHandler) que enviará los mensajes de log 
		 * 		a la consola.
		 * 
		 * 2. Nivel de registro del manejador: 
		 * 		Se establece el nivel de registro del manejador a ALL, lo que significa que 
		 * 		capturará todos los niveles de mensajes.
		 * 
		 * 3. Formatter: 
		 * 		Se utiliza un SimpleFormatter para formatear los mensajes de log de una manera 
		 * 		sencilla y legible.
		 * 
		 * 4. Agregar manejador al logger: 
		 * 		Se añade el manejador de consola al logger para que los mensajes se impriman en 
		 * 		la consola.
		 * 
		 * 5. Nivel de registro del logger: 
		 * 		Se establece el nivel de registro del logger a ALL para capturar todos los niveles 
		 * 		de mensajes (desde SEVERE hasta FINEST).
		 * 
		 */
		ConsoleHandler consoleHandler = new ConsoleHandler();   // 1.
		consoleHandler.setLevel(Level.ALL);						// 2. 
		consoleHandler.setFormatter(new SimpleFormatter());     // 3.
		logger.addHandler(consoleHandler);                      // 4.
		logger.setLevel(Level.ALL);                             // 5.

	}

	
	public void logIn () {
		this.isLog = true;
	}
	
	
	public void closeSession() {
		this.isLog = false;
	}
	
	
	/* Se puede hacer de 2 formas:
	 * 
	 * forma 1:
	 * logger.severe("Acceso inválido a la base de datos para búsquedas" );
	 * 
	 * forma 2:                                                                      
	 * logger.log( Level.SEVERE, "Acceso inválido a la base de datos para búsquedas" );
	 * 
	 */
	

	public Collection<String> getSearchResults(String queryString) {
		
		if (!this.isLog) {

			logger.severe("Acceso inválido a la base de datos para búsquedas");
			throw new RuntimeException("access denied"); 
			
		}

		logger.info("Acceso válido para búsquedas a la base de datos");
		return this.database.getSearchResults(queryString);
		
	}
	

	public int insertNewRow(List<String> rowData) {
		
		if (!this.isLog) {

			logger.severe("Acceso inválido a la base de datos para inserciones");
			throw new RuntimeException("access denied"); 
			
		}

		logger.warning("Acceso válido para inserciones a la base de datos");
		return this.database.insertNewRow(rowData);
		
	}
	

}