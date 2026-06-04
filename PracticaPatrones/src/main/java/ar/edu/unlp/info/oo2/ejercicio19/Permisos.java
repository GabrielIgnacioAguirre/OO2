package ar.edu.unlp.info.oo2.ejercicio19;

public class Permisos extends FileDecorator{
	
	public Permisos(File component) {
		super(component);
	}

	public String prettyPrint() {
		return this.getComponent().prettyPrint() + " - " + this.getPermisos();
	}
}
