package observers;

import encuesta.*;

public class GraficoDeBarras implements VoteObserver {

    @Override
    public void votoRecibido(Encuesta encuesta) {
        System.out.println("Dibujando gráfico de barras");
    }

}
