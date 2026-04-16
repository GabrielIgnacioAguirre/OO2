package ejer6_1;

public class EmpleadoPlanta extends Empleado {
	private static final int monto_hijos = 2000;
	private int cantidadHijos = 0;
	// ......
	
	public double sueldo() {
		return + super.sueldo() + (this.cantidadHijos * monto_hijos);
	}
}