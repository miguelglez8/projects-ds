package main;

import java.io.*;

import activar.ActivarVotoFrecuencia;
import activar.ActivarVotoIndice;
import actualizable.Backup;
import actualizable.GraficoBarras;
import actualizable.GraficoCircular;
import actualizable.LineaEstado;
import encuesta.*;

public class Main {

    public static void main(String[] args) throws IOException {
        TextUserInterface userInterface = new TextUserInterface();

        Encuesta encuesta = new Encuesta("¿Está a favor de la energia nuclear?");
        // añado todos los actualizables
        encuesta.añadirActualizable(new LineaEstado());
        encuesta.añadirActualizable(new GraficoCircular());
        encuesta.añadirActualizable(new Backup());
        encuesta.añadirActualizable(new GraficoBarras());

        userInterface.rellena(encuesta);
        
        // elimino el backup y el grafico de barras
        encuesta.eliminarActualizable(3);
        encuesta.eliminarActualizable(2);
        
        userInterface.rellena(encuesta);
        
        // elimino el grafico circular normal y lo añado para que se dibuje a partir del tercer voto
        encuesta.eliminarActualizable(1);
        encuesta.añadirActualizable(new ActivarVotoIndice(3, new GraficoCircular()));
        
        userInterface.rellena(encuesta);
        
        // añadimos un gráfico de barras para que se dibujen cada 3 votos
        encuesta.añadirActualizable(new ActivarVotoFrecuencia(3, new GraficoBarras()));
        
        userInterface.rellena(encuesta);

        // la línea de estado aparece a partir del cuarto voto y luego cada dos
        encuesta.eliminarActualizable(0);
        encuesta.añadirActualizable(new ActivarVotoIndice(4, new ActivarVotoFrecuencia(2, new LineaEstado())));
        
        userInterface.rellena(encuesta);
        
    }

}
