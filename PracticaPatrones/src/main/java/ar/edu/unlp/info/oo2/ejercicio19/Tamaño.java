package ar.edu.unlp.info.oo2.ejercicio19;

public class Tamaño extends FileDecorator{
	public Tamaño(File component) {
		super(component);
	}

	public String prettyPrint() {
		return this.getComponent().prettyPrint() + " - " + this.getTam();
	}
}
