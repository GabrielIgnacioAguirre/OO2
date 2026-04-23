package ar.edu.unlp.info.oo2.ejercicio2;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestEmpleado {
	private Pasante pasante;
	private Planta planta;
	private Temporario temporario;
	
	@BeforeEach
	public void setUp() {
		/// esCasado,cantHijos,examenesRendidos
		pasante = new Pasante(false,3,3);
		/// esCasado, cantHijos, añosAntiguedad
		planta = new Planta(false,3,3);
		/// esCasado, cantHijos, horasTrabajo
		temporario = new Temporario(false,3,3);
	}
	
	@Test
	public void pasanteTest() {
		assertEquals(20000, pasante.calcularBasico(), 0.01);
		assertEquals(6000, pasante.calcularAdicional(), 0.01);
		assertEquals(3200, pasante.calcularDescuento(), 0.01);
		assertEquals(28800, pasante.calcularSueldo(), 0.01);
	}
	@Test
	public void plantaTest() {
		assertEquals(50000, planta.calcularBasico(), 0.01);
		assertEquals(12000, planta.calcularAdicional(), 0.01);
		assertEquals(7100, planta.calcularDescuento(), 0.01);
		assertEquals(54900, planta.calcularSueldo(), 0.01);
	}
	@Test
	public void temporarioTest() {
		assertEquals(20900, temporario.calcularBasico(), 0.01);
		assertEquals(6000, temporario.calcularAdicional(), 0.01);
		assertEquals(3017, temporario.calcularDescuento(), 0.01);
		assertEquals(23883, temporario.calcularSueldo(), 0.01);
	}
}
