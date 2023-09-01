package actualizable;

import encuesta.Encuesta;

public class GraficoCircular implements Actualizable {

	@Override
	public void actualizar(Encuesta e) {
        System.out.println("Aquí se dibujaría el gráfico circular.");
	}

}
