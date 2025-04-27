package ar.edu.unlp.info.oo2.ejercicio_12_DispositivoMovilYConexiones;

import java.util.zip.CRC32;

public class CRC32_Calculator implements CRC_Calculator {

	@Override
	public Integer crcFor(String data) {
		CRC32 crc = new CRC32();
		String datos = "mensajito";
		crc.update(datos.getBytes());
		long result = crc.getValue();
		return (int) result;
	}

}
