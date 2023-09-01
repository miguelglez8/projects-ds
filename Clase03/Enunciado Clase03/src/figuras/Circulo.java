package figuras;

public class Circulo implements Figure {
	private int cX;
	private int cY;
	private double radio;
	
	public Circulo(int cX, int cY, double radio) {
		super();
		this.cX = cX;
		this.cY = cY;
		this.radio = radio;
	}

	@Override
	public boolean contiene(int x, int y) {
		return Math.sqrt(Math.pow(x - cX, 2) + Math.pow(y - cY, 2)) < radio;
	}
	
	@Override
	public void dibujar() {
		System.out.println("CIRCULO, CENTRO = "+cX+ " , "+cY + " RADIO = " + radio);
	}

	@Override
	public void mover(int x, int y) {
		this.cX+=x;
		this.cY+=y;
	}

}
