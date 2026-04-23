package ar.edu.unlp.info.oo2.biblioteca;

import java.util.List;

import org.json.simple.JSONObject;

public interface Exporter {
	public String exportar(List<Socio> socios);
}
