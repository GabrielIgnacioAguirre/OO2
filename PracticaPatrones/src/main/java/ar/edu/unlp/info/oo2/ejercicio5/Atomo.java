package ar.edu.unlp.info.oo2.ejercicio5;

public class Atomo implements ElementoQuimico {
	private String simbolo;
	private int pesoMolecular;
	private int carga;
	private String clasificacion;
	
	public String getClasificacion() {
		return clasificacion;
	}

	public String formula(){
		return this.simbolo;
	}
	
	public int getPesoMolecular() {
		return pesoMolecular;
	}
	
	public int carga(){
		return this.carga;
	}
	
	public boolean esValida(){
		return true;
	}


	//getters y setters
	public String getSimbolo() {
		return simbolo;
	}

	public void setSimbolo(String simbolo) {
		this.simbolo = simbolo;
	}


	public void setPesoMolecular(int pesoMolecular) {
		this.pesoMolecular = pesoMolecular;
	}

	public int getCarga() {
		return carga;
	}

	public void setCarga(int carga) {
		this.carga = carga;
	}
	
}
