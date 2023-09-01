package p2.categorias;

import p2.videoclub.Categoria;

public class Infantil implements Categoria {

    public double getPrecio(int dias) {
        double precio = 1.5;
        if (dias > 3)
            precio += (dias - 3) * 1.5;
        return precio;
    }

    public int getPuntos(int dias) {
        return 1;
    }

}
