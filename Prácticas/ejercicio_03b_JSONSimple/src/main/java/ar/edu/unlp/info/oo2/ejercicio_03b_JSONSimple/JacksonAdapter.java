package ar.edu.unlp.info.oo2.ejercicio_03b_JSONSimple;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.List;

public class JacksonAdapter extends VoorheesExporter {

    public String exportar(List<Socio> socios) {
    	
        ObjectMapper objectMapper = new ObjectMapper();
        String json = null;
        
        try {
        	
            json = objectMapper.writeValueAsString(socios);
            
        } catch (JsonProcessingException e) {
        	
            e.printStackTrace(); 
            
        }
        
        return json;
    }

}
