package herramientas;

import java.awt.Point;

import editor.Editor;
import figuras.Figure;

public class Seleccion implements Herramienta {

	private Editor editor;
	private Figure seleccionada;
	private Point posicion;
	
	public Seleccion(Editor editor) {
		this.editor = editor;
	}
	
	public void pinchar(int x, int y) {
		seleccionada = editor.getDibujo().getFigure(x, y);
		posicion = new Point(x, y);
	}

	public void mover(int x, int y) {
		desplazaPieza(x, y);
	}

	
	public void soltar(int x, int y) {
		desplazaPieza(x, y);
	}
	
	private void desplazaPieza(int x, int y) {
		if (seleccionada != null) {
			seleccionada.mover(x - posicion.x, y - posicion.y);
			posicion = new Point(x, y);
		}
		
	}

	@Override
	public String toString() {
		return "Seleccion";
	}
	
	

}
