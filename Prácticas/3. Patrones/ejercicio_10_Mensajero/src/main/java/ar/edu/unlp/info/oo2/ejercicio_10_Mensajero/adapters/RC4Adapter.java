package ar.edu.unlp.info.oo2.ejercicio_10_Mensajero.adapters;

import ar.edu.unlp.info.oo2.ejercicio_10_Mensajero.Cifrado;
import ar.edu.unlp.info.oo2.ejercicio_10_Mensajero.adaptees.RC4;

public class RC4Adapter implements Cifrado {
	
    private RC4 rc4;
    private String clave;

    public RC4Adapter(String clave) {
        this.rc4 = new RC4();
        this.clave = clave;
    }

    public String cifrar(String mensaje) {
        return rc4.encriptar(mensaje, clave);
    }

    public String descifrar(String mensaje) {
        return rc4.desencriptar(mensaje, clave);
    }
    
}
