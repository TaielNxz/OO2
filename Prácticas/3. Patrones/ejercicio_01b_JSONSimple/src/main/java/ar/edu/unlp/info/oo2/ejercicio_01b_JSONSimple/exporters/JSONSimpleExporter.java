package ar.edu.unlp.info.oo2.ejercicio_01b_JSONSimple.exporters;

import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import ar.edu.unlp.info.oo2.ejercicio_01b_JSONSimple.Socio;

public class JSONSimpleExporter {

    @SuppressWarnings("unchecked")
    private JSONObject crearSocio(Socio socio) {
        JSONObject socioJson = new JSONObject();
        socioJson.put("nombre", socio.getNombre());
        socioJson.put("email", socio.getEmail());
        socioJson.put("legajo", socio.getLegajo());
        return socioJson;
    }

    @SuppressWarnings("unchecked")
    public String exportar(List<Socio> socios) {
        JSONArray jsonArray = new JSONArray();
        socios.forEach(s -> jsonArray.add(this.crearSocio(s)));
        return jsonArray.toJSONString();
    }
    
}
