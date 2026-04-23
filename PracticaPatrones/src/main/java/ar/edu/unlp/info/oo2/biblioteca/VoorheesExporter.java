package ar.edu.unlp.info.oo2.biblioteca;

import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class VoorheesExporter implements Exporter {

	private String exportar(Socio socio) {
		JSONObject jo = new JSONObject();
		jo.put("nombre", socio.getNombre());
		jo.put("Email", socio.getEmail());
		jo.put("Legajo", socio.getLegajo());
		
		return jo.toJSONString();
	}
	
	@Override
	public String exportar(List<Socio> socios) {
		JSONArray ja = new JSONArray();
		socios.stream().forEach(s -> ja.add((this.exportar(s))));
		return ja.toJSONString();
	}
}
