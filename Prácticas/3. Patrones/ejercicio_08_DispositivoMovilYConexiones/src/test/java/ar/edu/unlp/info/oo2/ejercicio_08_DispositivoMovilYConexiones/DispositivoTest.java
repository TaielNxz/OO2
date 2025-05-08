package ar.edu.unlp.info.oo2.ejercicio_08_DispositivoMovilYConexiones;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unlp.info.oo2.ejercicio_08_DispositivoMovilYConexiones.calculator.CRC16_Calculator;
import ar.edu.unlp.info.oo2.ejercicio_08_DispositivoMovilYConexiones.calculator.CRC32_Calculator;
import ar.edu.unlp.info.oo2.ejercicio_08_DispositivoMovilYConexiones.connection.FourGAdapter;
import ar.edu.unlp.info.oo2.ejercicio_08_DispositivoMovilYConexiones.connection.WifiConn;

class DispositivoTest {

    private Dispositivo dispositivo;
    private Display display;
    private Ringer ringer;
	
	@BeforeEach
	void setUp() throws Exception {
		this.dispositivo = new Dispositivo();
	}
	
    @Test
    void testSend() {
        // (Wifi + CRC16) Configuración inicial
        String result1 = dispositivo.send("info test");
        assertTrue(result1.startsWith("Wifi Connection: info test"));
        
        // (Wifi + CRC32) Cambiamos a CRC32 
        dispositivo.configurarCRC(new CRC32_Calculator());
        String result2 = dispositivo.send("info test");
        assertTrue(result2.startsWith("Wifi Connection: info test"));
        
        // (4G + CRC32) Cambiamos a 4g 
        dispositivo.conectarCon(new FourGAdapter());
        String result3 = dispositivo.send("info test");
        assertTrue(result3.startsWith("4G Connection: info test"));
        
        // (4G + CRC16) Cambiamos a CRC16 
        dispositivo.configurarCRC(new CRC16_Calculator());
        String result4 = dispositivo.send("info test");
        assertTrue(result4.startsWith("4G Connection: info test"));
    }
	
    @Test
    void testConectarCon() {
        // Cambio a 4G
        String result1 = dispositivo.conectarCon(new FourGAdapter());
        assertEquals("Connection changed", result1);
        
        // Cambio a Wifi
        String result2 = dispositivo.conectarCon(new WifiConn());
        assertEquals("Connection changed", result2);
    }

    @Test
    void testConfigurarCRC() {
        // Cambio a CRC32
        String result1 = dispositivo.configurarCRC(new CRC32_Calculator());
        assertEquals("CRC calculator changed", result1);
        
        // Cambio a CRC16
        String result2 = dispositivo.configurarCRC(new CRC16_Calculator());
        assertEquals("CRC calculator changed", result2);
    }
}
