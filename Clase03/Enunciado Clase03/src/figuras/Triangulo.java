package figuras;

public class Triangulo implements Figure {
	private int x1,x2,x3;
	private int y1,y2,y3;
	
	

	public Triangulo(int x1, int y1, int x2, int y2, int x3, int y3) {
		super();
		this.x1 = x1;
		this.x2 = x2;
		this.x3 = x3;
		this.y1 = y1;
		this.y2 = y2;
		this.y3 = y3;
	}

	@Override
	public boolean contiene(int x, int y) {
		return (x1==x && y1==y) || (x2==x && y2==y) || (x3==x && y3==y);
	}
	
	@Override
	public void dibujar() {
		System.out.println("TRIANGULO, ESQ1 = "+x1+ " , "+y1 + " ESQ2 = "+x2 + " ," + y2 + " ESQ3 = "+x3 + " , " +y3);
	}


	@Override
	public void mover(int x, int y) {
		this.x1+=x;
		this.x2+=x;
		this.x3+=x;
		this.y1+=y;
		this.y2+=y;
		this.y3+=y;
	}
}
