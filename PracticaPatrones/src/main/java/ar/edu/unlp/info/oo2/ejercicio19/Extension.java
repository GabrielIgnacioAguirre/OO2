package ar.edu.unlp.info.oo2.ejercicio19;

public class Extension extends FileDecorator {
	
	public Extension (File component) {
		super(component);
	}

	public String prettyPrint() {
		return this.getComponent().prettyPrint() + " - " + this.getExtension();
	}
}
