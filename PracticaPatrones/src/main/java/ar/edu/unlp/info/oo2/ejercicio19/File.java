package ar.edu.unlp.info.oo2.ejercicio19;

import java.time.LocalDate;

public interface File {
	public String prettyPrint();
	public String getNombre();
	public String getExtension();
	public String getTam();
	public LocalDate getFechaCreacion();
	public LocalDate getFechaModificacion();
	public String getPermisos();
}
