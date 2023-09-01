package observers;

import encuesta.*;

public class GuardarResultados implements VoteObserver {

    @Override
    public void votoRecibido(Encuesta encuesta) {
        System.out.println("Guardando resultados");
    }

}
