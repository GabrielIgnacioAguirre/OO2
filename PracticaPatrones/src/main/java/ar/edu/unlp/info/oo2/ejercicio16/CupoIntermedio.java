package ar.edu.unlp.info.oo2.ejercicio16;

public class CupoIntermedio implements StateExcursion{
	
	public CupoIntermedio() {
		
	}
	
	public void inscribirUsuario(Excursion e, Usuario u){
		e.agregarUsuario(u);
		if (e.getUsuarios().size() == e.getCupo_max()) {
			e.setEstado(new CupoMaximo());
		}
	}
	
	public String obtenerInformacion(Excursion e) {
		return e.armarMensaje() + "Mail de los usuarios: "+ e.obtenerMails() + ", Usuarios faltantes: "+ e.usuariosFaltantes();
	}
	

}

