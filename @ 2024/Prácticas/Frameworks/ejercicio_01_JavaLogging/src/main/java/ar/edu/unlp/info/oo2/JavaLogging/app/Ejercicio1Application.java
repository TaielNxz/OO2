package ar.edu.unlp.info.oo2.JavaLogging.app;

import java.io.IOException;
import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

import javax.swing.SwingUtilities;

import ar.edu.unlp.info.oo2.JavaLogging.ui.WallPostUI;



public class Ejercicio1Application {
	
	
	// Instanciamos el Logger y le agregamos el nombre de la clase actual "Ejercicio1Application"
	private static Logger logger = Logger.getLogger( Ejercicio1Application.class.getName() );
	
	
	public static void main(String[] args) throws SecurityException, IOException {

		// Configurar el logger
		configureLogger();
		
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new WallPostUI();
			}
		});
	}
	
	
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
	private static void configureLogger()  {
		ConsoleHandler consoleHandler = new ConsoleHandler();   // 1.
		consoleHandler.setLevel(Level.ALL);						// 2. 
		consoleHandler.setFormatter(new SimpleFormatter());     // 3.
		logger.addHandler(consoleHandler);                      // 4.
		logger.setLevel(Level.ALL);                             // 5.
	}
	
    public static Logger getLogger() {
        return logger;
    }

}
