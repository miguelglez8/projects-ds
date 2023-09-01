package figuras;

public interface Figure {
	public void dibujar();
	public void mover(int dx, int dy);
	public boolean contiene(int x, int y);
}
