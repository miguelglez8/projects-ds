package figuras;

public class Cuadrado implements Figure {
	private int esqX,esqY;
	private int ancho;
	private int alto;
	
	public Cuadrado(int esqX, int esqY, int ancho, int alto) {
		super();
		this.esqX = esqX;
		this.esqY = esqY;
		this.ancho = ancho;
		this.alto = alto;
	}

	@Override
	public boolean contiene(int x, int y) {
		return (esqX <= x && x <= esqX + ancho) && (esqY <= y && y <= esqY + alto);
	}

	@Override
	public void dibujar() {
		System.out.println("CUADRADO, ESQ SUP IZDA = "+esqX + " , "+esqY + " ancho = "+ancho + ", alto = " + alto);
	}

	@Override
	public void mover(int x, int y) {
		esqX+=x;
		esqY+=y;
	}


}
