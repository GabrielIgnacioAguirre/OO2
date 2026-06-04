package ar.edu.unlp.info.oo2.ejercicio19;

import java.time.LocalDate;

public class FileDecorator implements File{
	private File component;
	
	public FileDecorator(File component) {
		this.component = component;
	}
	
	public String prettyPrint() {
		return this.component.prettyPrint();
	}
	
	
	//Getters y setters
	public String getNombre() {
		return this.component.getNombre();
	}
	public String getExtension() {
		return this.component.getExtension();
	}
	public String getTam() {
		return this.component.getTam();
	}
	public LocalDate getFechaCreacion() {
		return this.component.getFechaCreacion();		
	}
	public LocalDate getFechaModificacion() {
		return this.component.getFechaModificacion();
	}
	public String getPermisos() {
		return this.component.getPermisos();
	}
	protected File getComponent() {
		return this.component;
	}
}
