package ar.edu.unlp.info.oo2.ejercicio12;

import java.time.LocalDate;

public class CancelacionFlexible implements ICancelacion{
	
	
	@Override
	public double calcularCancelacion(double monto, LocalDate fechaCancelacion, LocalDate fechaReserva) {
		if(fechaCancelacion.isAfter(fechaReserva))
			return 0;
		return monto;
	}
}