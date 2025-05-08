package ar.edu.unlp.info.oo2.ejercicio_10_Mensajero;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import ar.edu.unlp.info.oo2.ejercicio_10_Mensajero.adapters.FeistelCipherAdapter;
import ar.edu.unlp.info.oo2.ejercicio_10_Mensajero.adapters.RC4Adapter;

class MensajeroTest {

    @Test
    void testMensajeroConDistintosCifrados() {
        Mensajero mensajero = new Mensajero();

        // Usando Feistel
        mensajero.setCifrado(new FeistelCipherAdapter("clave123"));
        String mensajeOriginal = "Hola Mundo";
        String mensajeCifrado = mensajero.enviar(mensajeOriginal);
        String mensajeRecibido = mensajero.recibir(mensajeCifrado);

        // chekear...
        System.out.println("Con Feistel: " + mensajeRecibido);
        assertEquals(mensajeOriginal, mensajeRecibido);

        // Cambiar a RC4
        mensajero.setCifrado(new RC4Adapter("miClaveSecreta"));
        mensajeCifrado = mensajero.enviar(mensajeOriginal);
        mensajeRecibido = mensajero.recibir(mensajeCifrado);

        // chekear...
        System.out.println("Con RC4: " + mensajeRecibido);
        assertEquals(mensajeOriginal, mensajeRecibido);
    }
}
