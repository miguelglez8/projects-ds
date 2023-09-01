package p2.videoclub;

public class Alquiler {
    private Pelicula pelicula;
    private int dias;

    public Alquiler(Pelicula pelicula, int dias) {
        this.pelicula = pelicula;
        this.dias = dias;
    }

    public int getDias() {
        return dias;
    }

    public Pelicula getPelicula() {
        return pelicula;
    }

    public int getPuntos() {
        return pelicula.getPuntos(dias);
    }

    public double getPrecio() {
        return pelicula.getPrecio(dias);
    }
}
