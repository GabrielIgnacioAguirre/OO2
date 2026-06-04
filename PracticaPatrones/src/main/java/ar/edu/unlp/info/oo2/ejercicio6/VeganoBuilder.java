package ar.edu.unlp.info.oo2.ejercicio6;

public class VeganoBuilder extends SandwichBuilder{
	protected void precioPan()
	{
		this.sandwich.setPrecioPan(100);
	}
	
	protected void precioAderezo()
	{
		this.sandwich.setPrecioAderezo(20);
	}
	
	protected void precioPrincipal()
	{
		this.sandwich.setPrecioPrincipal(500);
	}
	
	protected void precioAdicional()
	{
		this.sandwich.setPrecioAdicional(0);
	}
}