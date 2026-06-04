package ar.edu.unlp.info.oo2.ejercicio16;

public interface StateExcursion {
	
	public abstract void inscribirUsuario(Excursion e, Usuario u);
	public abstract String obtenerInformacion(Excursion e);
}
