package ar.edu.unlp.info.oo2.ejercicio_10_Mensajero;

public class FeistelCipherAdapter implements Cifrado {
	
    private FeistelCipher feistelCipher;

    public FeistelCipherAdapter(String clave) {
        this.feistelCipher = new FeistelCipher(clave);
    }

    public String cifrar(String mensaje) {
        return feistelCipher.encode(mensaje);
    }

    public String descifrar(String mensaje) {
        return feistelCipher.encode(mensaje);  // Feistel usa encode para cifrar y descifrar
    }
    
}
