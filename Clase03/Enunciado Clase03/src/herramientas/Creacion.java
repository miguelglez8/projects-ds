package herramientas;

import java.awt.Point;

import editor.Editor;
import figuras.Figure;

public abstract class Creacion implements Herramienta {
	
	private Point inicio,fin;
	private Editor editor;
	
	public Creacion(Editor editor) {
		this.editor = editor;
	}
	
	public void pinchar(int x, int y) {
		inicio = new Point(x,y);
	}
	public void mover(int x, int y) {
		
	}
	public void soltar(int x,int y) {
		fin = new Point(x, y);
		Figure figura = creaFigura(inicio, fin);
		editor.getDibujo().addFigura(figura);
		editor.finHerramienta();	
	}
	
	protected abstract Figure creaFigura(Point inicio,Point fin);

	@Override
	public String toString() {
		return "Creacion";
	}
	
	

}
