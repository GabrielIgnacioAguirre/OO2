package ar.edu.unlp.info.oo2.ejercicio16;

public class CupoMaximo implements StateExcursion {

	@Override
	public void inscribirUsuario(Excursion e, Usuario u) {
		e.listaEspera.add(u);
	}

	@Override
	public String obtenerInformacion(Excursion e) {
		return e.armarMensaje();
	}

}
