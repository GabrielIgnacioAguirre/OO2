package ejer6_2;

public class Jugador {
    private static final int restar_puntuacion = 50;
	private static final int sumar_puntuacion = 100;
	private String apellido;
    private int puntuacion = 0;
    private String nombre;
    
	public void incrementar() {
	    setPuntuacion(getPuntuacion() + sumar_puntuacion);
	}
	public void decrementar() {
	    setPuntuacion(getPuntuacion() - restar_puntuacion);
	}
    
	//////////////////////////////////
    public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getPuntuacion() {
		return puntuacion;
	}
	public void setPuntuacion(int puntuacion) {
		this.puntuacion = puntuacion;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
}
