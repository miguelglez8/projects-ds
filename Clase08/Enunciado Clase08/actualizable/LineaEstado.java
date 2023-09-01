package actualizable;

import encuesta.Encuesta;

public class LineaEstado implements Actualizable {

	@Override
	public void actualizar(Encuesta e) {
		System.out.println("Nº de votos si = " + e.getVotosSi() + " - " + 
				"Nº de votos no = " + e.getVotosNo());
	}

}
