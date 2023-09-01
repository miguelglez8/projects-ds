package herramientas;

import java.awt.Point;

import editor.Editor;
import figuras.Circulo;
import figuras.Figure;

public class CreacionCirculo extends Creacion {
	public CreacionCirculo(Editor editor) {
		super(editor);
	}
	

	@Override
	protected Figure creaFigura(Point inicio, Point fin) {
		return new Circulo((inicio.x+fin.x)/2, (inicio.y+fin.y)/2, Math.max(fin.x - inicio.x, fin.y - inicio.y) / 2);

	}

	

}
