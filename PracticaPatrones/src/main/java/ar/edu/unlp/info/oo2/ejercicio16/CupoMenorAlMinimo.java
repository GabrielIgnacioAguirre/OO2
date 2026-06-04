package ar.edu.unlp.info.oo2.ejercicio16;

import java.util.List;

public class CupoMenorAlMinimo implements StateExcursion{
	
	public void inscribirUsuario(Excursion e, Usuario u){
		e.agregarUsuario(u);
		if (e.getUsuarios().size() >= e.getCupo_min()) {
			e.setEstado(new CupoIntermedio());
		}
	}
	
	public String obtenerInformacion(Excursion e) {
		return e.armarMensaje() + "Usuarios faltantes: "+ e.usuariosFaltantes();
	}
	

}