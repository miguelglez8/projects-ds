package p2.videoclub;

public class Pelicula {
    private String titulo;
    private Categoria categoria; // puede seguir con int, en vez de tipo Categoria

    public Pelicula(String titulo, Categoria categoria) {
        this.titulo = titulo;
        this.categoria = categoria;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getPuntos(int dias) { // también se podía poner aquí el switch
        return categoria.getPuntos(dias);
    }

    public double getPrecio(int dias) {
        return categoria.getPrecio(dias);
    }
}
