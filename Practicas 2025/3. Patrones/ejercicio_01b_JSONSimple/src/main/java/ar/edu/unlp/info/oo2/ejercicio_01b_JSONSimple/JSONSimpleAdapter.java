package ar.edu.unlp.info.oo2.ejercicio_01b_JSONSimple;

import org.json.simple.JSONObject;
import org.json.simple.JSONArray;

import java.util.List;


public class JSONSimpleAdapter extends VoorheesExporter {
	
	
	@SuppressWarnings("unchecked")
	private JSONObject crearSocio( Socio socio ) {
		
		JSONObject socioJson = new JSONObject();
		
		socioJson.put( "nombre", socio.getNombre() );
		socioJson.put( "email", socio.getEmail() );
		socioJson.put( "legajo", socio.getLegajo() );
		
		return socioJson;
		
	}

	
	@SuppressWarnings("unchecked")
	public String exportar( List<Socio> socios ) {
		
		JSONArray jsonArray = new JSONArray();
		
		socios.stream().forEach( socio -> jsonArray.add( this.crearSocio(socio) ) );
		
		return jsonArray.toJSONString();

	}
}