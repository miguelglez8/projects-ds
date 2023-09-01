package activar;

import actualizable.Actualizable;
import encuesta.Encuesta;

public class ActivarVotoIndice implements Actualizable {
	
	private int indice;
	private Actualizable actualizable;
	private int counter = 0;

	public ActivarVotoIndice(int indice, Actualizable a) {
		this.indice=indice;
		this.actualizable=a;
	}
	
	@Override
	public void actualizar(Encuesta e) {
		if (counter >= indice-1) {
			actualizable.actualizar(e);
		}
		counter++;
	}

}
