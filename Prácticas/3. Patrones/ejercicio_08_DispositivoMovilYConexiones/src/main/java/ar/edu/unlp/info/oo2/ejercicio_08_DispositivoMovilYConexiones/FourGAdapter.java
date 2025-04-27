package ar.edu.unlp.info.oo2.ejercicio_08_DispositivoMovilYConexiones;

public class FourGAdapter implements Connection {

	private FourGConnection connection;
	
    public FourGAdapter() {
        this.connection = new FourGConnection();
    }
	
	@Override
	public String sendData(String data, Integer crc) {
		return connection.transmit(data, crc);
	}

	@Override
	public String pict() {
		return connection.symb();
	}

}
