package ar.edu.unlp.info.oo2.ejercicio7;

public class BonoBajoRiesgo extends Bono{

	public BonoBajoRiesgo() {

	}

	@Override
	protected double obtenerVariacionMaxima() {
		return 0.1;
	}
	
}