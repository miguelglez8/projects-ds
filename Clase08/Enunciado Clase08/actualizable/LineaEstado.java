package actualizable;

import encuesta.Encuesta;

public class LineaEstado implements Actualizable {

	@Override
	public void actualizar(Encuesta e) {
		System.out.println("N� de votos si = " + e.getVotosSi() + " - " + 
				"N� de votos no = " + e.getVotosNo());
	}

}
