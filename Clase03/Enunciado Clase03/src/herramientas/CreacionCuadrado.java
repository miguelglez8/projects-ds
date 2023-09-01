package herramientas;

import java.awt.Point;

import editor.Editor;
import figuras.Cuadrado;
import figuras.Figure;

public class CreacionCuadrado extends Creacion {

	public CreacionCuadrado(Editor editor) {
		super(editor);
	}
	

	@Override
	protected Figure creaFigura(Point inicio, Point fin) {
		return new Cuadrado(inicio.x,inicio.y,fin.x-inicio.x,fin.y-inicio.y);

	}

}
