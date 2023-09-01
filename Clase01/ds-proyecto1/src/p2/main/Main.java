package p2.main;

import p2.categorias.Infantil;
import p2.categorias.Normal;
import p2.categorias.Novedad;
import p2.videoclub.Alquiler;
import p2.videoclub.Cliente;
import p2.videoclub.Pelicula;

public class Main {

    public static void main(String[] args) {

        Pelicula hotFuzz = new Pelicula("Hot Fuzz", new Novedad());
        Pelicula toyStory = new Pelicula("Toy Story", new Infantil());
        Pelicula zombiesParty = new Pelicula("Zombies Party", new Normal());

        Cliente raul = new Cliente("Raúl");
        raul.addAlquiler(new Alquiler(hotFuzz, 2));
        raul.addAlquiler(new Alquiler(toyStory, 6));
        raul.addAlquiler(new Alquiler(zombiesParty, 8));

        raul.imprimeInforme();
    }
}
