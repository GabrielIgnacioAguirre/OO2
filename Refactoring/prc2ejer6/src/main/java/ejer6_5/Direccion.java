package ejer6_5;

public class Direccion {
	private String localidad;
	private String calle;
	private String numero;
	private String departamento;
	
	public String getDireccionFormateada() {
		return 
			getLocalidad() + ", " +
			getCalle() + ", " +
			getNumero() + ", " +
			getDepartamento();
}
	///////////////////////////
	protected String getLocalidad() {
		return localidad;
	}
	protected String getCalle() {
		return calle;
	}
	protected String getNumero() {
		return numero;
	}
	protected String getDepartamento() {
		return departamento;
	}	
}
