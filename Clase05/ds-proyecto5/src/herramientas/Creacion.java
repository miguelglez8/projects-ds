package herramientas;

import java.awt.Point;

import editor.Editor;
import figuras.Figure;
import modifica.ModificacionCreacion;

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
		editor.getHistorial().addDeshacer(new ModificacionCreacion(figura, editor));
		editor.finHerramienta();	
	}
	
	protected abstract Figure creaFigura(Point inicio,Point fin);

}
