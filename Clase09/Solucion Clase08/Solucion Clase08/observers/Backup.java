package observers;

import encuesta.*;

public class Backup implements VoteObserver {

    @Override
    public void votoRecibido(Encuesta encuesta) {
        System.out.println("Guardando resultados");
    }

}
