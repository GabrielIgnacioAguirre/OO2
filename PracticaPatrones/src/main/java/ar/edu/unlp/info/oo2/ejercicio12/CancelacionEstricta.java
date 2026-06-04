package ar.edu.unlp.info.oo2.ejercicio12;

import java.time.LocalDate;

public class CancelacionEstricta implements ICancelacion{
	
	@Override
	public double calcularCancelacion(double monto, LocalDate fechaCancelacion, LocalDate fechaReserva) {
		return 0;
	}
}
