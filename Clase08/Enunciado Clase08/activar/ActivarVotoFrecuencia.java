package activar;

import actualizable.Actualizable;
import encuesta.Encuesta;

public class ActivarVotoFrecuencia implements Actualizable {
	
	private int frecuencia;
	private Actualizable actualizable;
	private int counter = 0;

	public ActivarVotoFrecuencia(int frecuencia, Actualizable a) {
		this.frecuencia=frecuencia;
		this.actualizable=a;
		this.counter = frecuencia + 1;
	}
	
	@Override
	public void actualizar(Encuesta e) {
		if (counter >= frecuencia) {
			actualizable.actualizar(e);
			counter = 0;
		}
		counter++;
	}

}
