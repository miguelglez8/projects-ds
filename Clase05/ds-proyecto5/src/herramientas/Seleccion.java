package herramientas;

import java.awt.Point;

import editor.Editor;
import figuras.Figure;
import modifica.ModificacionMovimiento;

public class Seleccion implements Herramienta {

	private Editor editor;
	private Figure seleccionada;
	private Point posicion;
	private Point inicio;
	
	public Seleccion(Editor editor) {
		this.editor = editor;
	}
	
	public void pinchar(int x, int y) {
		seleccionada = editor.getDibujo().getFigure(x, y);
		inicio = posicion = new Point(x, y);
	}

	public void mover(int x, int y) {
		mueveIncremento(x, y);
	}

	
	public void soltar(int x, int y) {
		mueveIncremento(x, y);
		editor.getHistorial().addDeshacer(new ModificacionMovimiento(seleccionada, posicion.x - inicio.x, posicion.y - inicio.y));
	}
	
	private void mueveIncremento(int x, int y) {
		if (seleccionada != null) {
			seleccionada.mover(x - posicion.x, y - posicion.y);
			posicion = new Point(x, y);
		}
		
	}

}
