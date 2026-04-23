package ar.edu.unlp.info.oo2.ejercicio2;

public class Pasante extends Empleado{
	private int examenesRendidos;
	
	@Override
	public double calcularBasico() {
		return 20000;
	}
	
	@Override
	public double calcularAdicional() {
		return getExamenesRendidos() * 2000;
	}
	
	public Pasante(boolean esCasado, int cantHijos, int examenesRendidos) {
		super(esCasado, cantHijos);
		this.examenesRendidos = examenesRendidos;
	}

	// getters y setters
	public int getExamenesRendidos() {
		return examenesRendidos;
	}

	public void setExamenesRendidos(int examenesRendidos) {
		this.examenesRendidos = examenesRendidos;
	}
}
