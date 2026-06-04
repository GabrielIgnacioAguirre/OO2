package ar.edu.unlp.info.oo2.ejercicio12;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
	private String nombre;
	private List<AutoEnAlquiler> autosEnAlqquiler;
	
	public Usuario(String nombre)
	{
		this.nombre = nombre;
		this.autosEnAlqquiler = new ArrayList<AutoEnAlquiler>();
	}
	
	
	public void agregarAuto(AutoEnAlquiler auto)
	{
		this.autosEnAlqquiler.add(auto);
	}
	
}