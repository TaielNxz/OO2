package ar.edu.unlp.info.oo2.ejercicio_10_Mensajero;

public class Mensajero {
	
    private Cifrado cifrado;

    public void setCifrado(Cifrado cifrado) {
        this.cifrado = cifrado;
    }

    public String enviar(String mensaje) {
        return cifrado.cifrar(mensaje);
    }

    public String recibir(String mensajeCifrado) {
        return cifrado.descifrar(mensajeCifrado);
    }
    
}
