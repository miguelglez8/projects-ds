package p2.categorias;

import p2.videoclub.Categoria;

public class Novedad implements Categoria {

    public double getPrecio(int dias) {
        return dias * 3;
    }

    public int getPuntos(int dias) {
        return (dias > 1) ? 2 : 1;
    }
}
