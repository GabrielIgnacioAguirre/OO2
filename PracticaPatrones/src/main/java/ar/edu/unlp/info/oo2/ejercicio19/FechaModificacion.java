package ar.edu.unlp.info.oo2.ejercicio19;

public class FechaModificacion extends FileDecorator{
	public FechaModificacion(File component) {
		super(component);
	}

	public String prettyPrint() {
		return this.getComponent().prettyPrint() + " - " + this.getFechaModificacion().toString();
	}
}
