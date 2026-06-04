package ar.edu.unlp.info.oo2.ejercicio16;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

public class Excursion {
	private String nombre;
	private LocalDate fechaInicio;
	private LocalDate fechaFin;
	private String puntoEncuentro;
	private double costo;
	private int cupoMin;
	private int cupoMax;
	private StateExcursion estado;
	List<Usuario> usuarios;
	List<Usuario> listaEspera;
	
	public Excursion(String nombre, LocalDate fechaInicio, LocalDate fechaFin, String puntoEncuntro, double costo,
			int cupoMin, int cupoMax) {
		this.nombre = nombre;
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
		this.puntoEncuentro = puntoEncuntro;
		this.costo = costo;
		this.cupoMin = cupoMin;
		this.cupoMax = cupoMax;
		this.usuarios = new ArrayList<Usuario>();
		this.listaEspera = new ArrayList<Usuario>();
		this.estado = new CupoMenorAlMinimo();
	}
	
	public String armarMensaje() {
		return "nombre: " + this.nombre
				+ ", Costo: " + this.costo
				+ "Fechas: " + this.fechaInicio + this.fechaFin
				+ ", Punto de encuentro: " + this.puntoEncuentro + ", ";
	}
	public String obtenerMails() {
		return this.usuarios.stream().map(Usuario::getEmail).collect(Collectors.joining(", "));
	}
	public int usuariosFaltantes() {
		return this.getCupo_max() - this.getUsuarios().size(); 
	}
	
	public void agregarUsuario(Usuario u) {
		this.usuarios.add(u);
	}
	
	
	
	// getters
	
	public String getNombre() {
		return nombre;
	}
	public void setEstado(StateExcursion estado) {
		this.estado = estado;
	}

	public LocalDate getFecha_inicio() {
		return fechaInicio;
	}
	public LocalDate getFecha_fin() {
		return fechaFin;
	}
	public String getPunto_encuentro() {
		return puntoEncuentro;
	}
	public double getCosto() {
		return costo;
	}
	public int getCupo_min() {
		return cupoMin;
	}
	public int getCupo_max() {
		return cupoMax;
	}
	public List<Usuario> getUsuarios() {
		return usuarios;
	}
	
	

}
