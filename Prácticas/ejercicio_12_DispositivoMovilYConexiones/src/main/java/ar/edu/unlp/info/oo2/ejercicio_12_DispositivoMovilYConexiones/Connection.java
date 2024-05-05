package ar.edu.unlp.info.oo2.ejercicio_12_DispositivoMovilYConexiones;

public interface Connection {

	public String sendData(String data, Integer crc);
	
	public String pict();
	
}
