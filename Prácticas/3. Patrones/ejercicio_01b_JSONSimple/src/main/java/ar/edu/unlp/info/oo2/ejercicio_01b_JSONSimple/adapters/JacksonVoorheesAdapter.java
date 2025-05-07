package ar.edu.unlp.info.oo2.ejercicio_01b_JSONSimple.adapters;

import java.util.List;

import ar.edu.unlp.info.oo2.ejercicio_01b_JSONSimple.Socio;
import ar.edu.unlp.info.oo2.ejercicio_01b_JSONSimple.exporters.*;

public class JacksonVoorheesAdapter extends VoorheesExporter {

    private JacksonExporter jacksonExporter;

    public JacksonVoorheesAdapter() {
        this.jacksonExporter = new JacksonExporter();
    }

    @Override
    public String exportar(List<Socio> socios) {
        return jacksonExporter.exportar(socios);
    }
}
