package ejer6_1;

public class Empleado {
	private static final double descuento_sueldo = 0.13;
	private String nombre;
	private String apellido;
	protected double sueldoBasico = 0;

	public Empleado() {
		super();
	}
	
	public double sueldo() {
		return this.descuento();
	}
	
	public double descuento() {
		return this.sueldoBasico * descuento_sueldo;
	}
}