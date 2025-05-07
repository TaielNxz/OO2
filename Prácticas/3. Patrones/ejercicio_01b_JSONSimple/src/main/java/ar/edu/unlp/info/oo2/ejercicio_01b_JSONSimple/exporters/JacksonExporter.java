package ar.edu.unlp.info.oo2.ejercicio_01b_JSONSimple.exporters;

import java.util.List;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import ar.edu.unlp.info.oo2.ejercicio_01b_JSONSimple.Socio;

public class JacksonExporter {

    public String exportar(List<Socio> socios) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return mapper.writeValueAsString(socios);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
            return "[]"; // en caso de error, JSON vacío
        }
    }
}
