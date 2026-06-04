package ar.edu.unlp.info.oo2.ejercicio7;

import java.util.Random;

public class BonoAltoRiesgo extends Bono{

	public BonoAltoRiesgo() {
		super();
	}

	@Override
	protected double obtenerVariacionMaxima() {
		return 0.7;
	}

}