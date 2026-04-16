package ejer6_3;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

public class Post {
	private String texto;
	private LocalDateTime fecha;
	private Usuario usuario;
	
	
	protected Usuario getUsuario() {
		return usuario;
	}
	protected String getTexto() {
		return texto;
	}
	protected LocalDateTime getFecha() {
		return fecha;
	}
	
}
