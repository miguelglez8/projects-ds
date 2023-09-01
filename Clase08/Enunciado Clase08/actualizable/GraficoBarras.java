package actualizable;

import encuesta.Encuesta;

public class GraficoBarras implements Actualizable {

	@Override
	public void actualizar(Encuesta e) {
        System.out.println("Aquí se dibujaría el gráfico de barras.");
	}

}
