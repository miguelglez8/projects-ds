package observers;

import encuesta.*;

public class GraficoCircular implements VoteObserver {

    @Override
    public void votoRecibido(Encuesta encuesta) {
        System.out.println("Dibujando gráfico circular");
    }

}
