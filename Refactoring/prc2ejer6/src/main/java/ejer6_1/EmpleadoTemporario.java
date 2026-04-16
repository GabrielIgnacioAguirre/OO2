package ejer6_1;

public class EmpleadoTemporario extends Empleado {
    private static final int monto_hijos = 1000;
	private static final int monto_horas = 500;
	private double horasTrabajadas = 0;
    private int cantidadHijos = 0;
    // ......
    
    public double sueldo() {
    	return  super.sueldoBasico + (this.horasTrabajadas * monto_horas) 
    			+(this.cantidadHijos * monto_hijos); 
    	}
}

