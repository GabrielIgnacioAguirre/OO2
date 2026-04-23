package ar.edu.unlp.info.oo2.ejercicio2;

public class Planta extends Empleado{
	private int añosAntiguedad;
	
	public double calcularBasico() {
		return 50000;
	}

	public double calcularAdicional() {
		double monto = 0;
		if (getEsCasado()) monto += 5000;
		monto += 2000 * getCantHijos();
		monto += 2000 * getAñosAntiguedad();
		return monto;
	}

	public Planta(Boolean esCasado, int cantHijos, int añosAntiguedad) {
		super(esCasado, cantHijos);
		this.añosAntiguedad = añosAntiguedad;
	}

	// setters y getters
	public int getAñosAntiguedad() {
		return añosAntiguedad;
	}

	public void setAñosAntiguedad(int añosAntiguedad) {
		this.añosAntiguedad = añosAntiguedad;
	}
}
