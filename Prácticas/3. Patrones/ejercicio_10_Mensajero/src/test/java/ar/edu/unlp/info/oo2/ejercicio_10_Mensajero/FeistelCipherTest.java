/**
 * 
 */
package ar.edu.unlp.info.oo2.ejercicio_10_Mensajero;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unlp.info.oo2.ejercicio_10_Mensajero.adaptees.FeistelCipher;


/**
 * @author gperez
 *
 */
class FeistelCipherTest {

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void test() throws Exception {
		String password = "clave";
		FeistelCipher feistelCipher = new FeistelCipher(password);
 
        String mensaje = "Hola mundo!";
        assertEquals(mensaje, feistelCipher.encode(feistelCipher.encode(mensaje)));
	}
}
