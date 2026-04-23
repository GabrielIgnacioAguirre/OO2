package ar.edu.unlp.info.oo2.ejercicio2;

public abstract class Empleado {
	private boolean esCasado;
	private int cantHijos;
	
	public double calcularSueldo() {
		return calcularBasico() + calcularAdicional() - calcularDescuento();
	}
	
	protected abstract double calcularBasico();
	protected abstract double calcularAdicional();
	
	protected double calcularDescuento() {
		return this.calcularBasico() * 0.13 + this.calcularAdicional() * 0.05;
	}

	public Boolean getEsCasado() {
		return esCasado;
	}

	public int getCantHijos() {
		return cantHijos;
	}

	public Empleado(Boolean esCasado, int cantHijos) {
		super();
		this.esCasado = esCasado;
		this.cantHijos = cantHijos;
	}
	
}
