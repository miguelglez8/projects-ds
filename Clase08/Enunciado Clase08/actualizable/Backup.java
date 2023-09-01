package actualizable;

import encuesta.Encuesta;

public class Backup implements Actualizable {

	@Override
	public void actualizar(Encuesta e) {
        System.out.println("Aquí se guardarán los datos en disco/BD.");
	}

}
