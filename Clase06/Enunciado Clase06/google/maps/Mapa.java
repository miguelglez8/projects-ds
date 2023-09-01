package google.maps;

import java.awt.Rectangle;
import java.util.*;


public class Mapa {
    private List<Marcador> marcadores = new ArrayList<Marcador>();

    public void add(Marcador element) {
        marcadores.add(element);
    }
    
    public void dibujar() {
        // Se dibujarán los marcadores encima
        for (Marcador marcador : marcadores)
            System.out.println("Marcador en " + marcador.getCoordenadas());
    }

    public void pulsacionCorta(int x, int y) {
        Marcador marcador = buscaMarcador(x, y);
        if (marcador != null)
            System.out.println("Ventana flotante: " + marcador.getTooltipInfo());
    }

    public void pulsacionLarga(int x, int y) {
        Marcador marcador = buscaMarcador(x, y);
        if (marcador != null)
            marcador.abrir();
    }

    // Método auxiliar privado ----------------------
    private Marcador buscaMarcador(int x, int y) {
        for (Marcador marcador : marcadores) {
            Coordenadas coordenadas = marcador.getCoordenadas();
            Rectangle elementArea = new Rectangle((int) coordenadas.getLongitud(), (int) coordenadas.getLatitud(), 9,
                    9);
            if (elementArea.contains(x, y))
                return marcador;
        }
        return null;
    }

	


}
