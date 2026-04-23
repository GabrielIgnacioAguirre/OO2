package ar.edu.unlp.info.oo2.ejercicio2;

public class Temporario extends Empleado{
	private int horasTrabajo;
	
	public double calcularBasico() {
		return 20000 + getHorasTrabajo() * 300;
	}
	public double calcularAdicional() {
		double monto = 0;
		if (getEsCasado()) monto += 5000;
		monto += 2000 * getCantHijos();
		return monto;
	}
	public Temporario(Boolean esCasado, int cantHijos, int horasTrabajo) {
		super(esCasado, cantHijos);
		this.horasTrabajo = horasTrabajo;
	}
	//getters y setters
	public void setHorasTrabajo(int horasTrabajo) {
		this.horasTrabajo = horasTrabajo;
	}
	public int getHorasTrabajo() {
		return horasTrabajo;
	}
}
