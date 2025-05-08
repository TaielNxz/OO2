package ar.edu.unlp.info.oo2.ejercicio_08_DispositivoMovilYConexiones.connection;

public interface Connection {

	public String sendData(String data, Integer crc);
	
	public String pict();
	
}
