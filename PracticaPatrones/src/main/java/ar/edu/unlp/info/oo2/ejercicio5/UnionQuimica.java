package ar.edu.unlp.info.oo2.ejercicio5;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class UnionQuimica implements ElementoQuimico{
	
	private List<Atomo> combinacion;
	
	public UnionQuimica(Atomo elemento1, Atomo elemento2) {
		combinacion = new ArrayList<Atomo>();
		combinacion.add(elemento1); combinacion.add(elemento2);
	}
	
	public String formula() {
	    return combinacion.stream()
	            .map(ElementoQuimico::formula)
	            .collect(Collectors.joining());
	}
	
	public int getPesoMolecular() {
		return this.combinacion.stream().mapToInt(a -> a.getPesoMolecular()).sum();
	}
	
	public int getCarga(){
		return this.combinacion.stream().mapToInt(a -> a.carga()).sum();
	}
	
	public boolean esValida(){
		return this.combinacion.stream()
				.filter(a -> a.getClasificacion().equals("Metal"))
				.count() < 2;
	}
}
