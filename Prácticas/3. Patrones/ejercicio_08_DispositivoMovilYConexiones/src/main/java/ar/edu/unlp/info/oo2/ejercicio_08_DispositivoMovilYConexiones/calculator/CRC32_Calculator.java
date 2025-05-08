package ar.edu.unlp.info.oo2.ejercicio_08_DispositivoMovilYConexiones.calculator;

import java.util.zip.CRC32;

public class CRC32_Calculator implements CRC_Calculator {

	@Override
	public Integer crcFor(String data) {
		
		CRC32 crc = new CRC32();
		String datos = "un mensaje";
		crc.update(datos.getBytes());
		long result = crc.getValue();
		
		return (int) result;
	}
	

//  Alternativa sin string plano
//
//	public Integer crcFor(String data) {
//		CRC32 crc = new CRC32();
//		crc.update(data.getBytes());
//		return (int) crc.getValue();
//	}

}
