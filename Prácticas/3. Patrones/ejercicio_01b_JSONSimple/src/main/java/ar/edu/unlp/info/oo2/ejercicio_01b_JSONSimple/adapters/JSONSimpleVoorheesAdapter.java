package ar.edu.unlp.info.oo2.ejercicio_01b_JSONSimple.adapters;

import java.util.List;

import ar.edu.unlp.info.oo2.ejercicio_01b_JSONSimple.Socio;
import ar.edu.unlp.info.oo2.ejercicio_01b_JSONSimple.exporters.*;

public class JSONSimpleVoorheesAdapter extends VoorheesExporter {

    private JSONSimpleExporter jsonSimpleExporter;

    public JSONSimpleVoorheesAdapter() {
        this.jsonSimpleExporter = new JSONSimpleExporter();
    }

    @Override
    public String exportar(List<Socio> socios) {
        return jsonSimpleExporter.exportar(socios);
    }
}
