package herramientas;

import java.awt.Point;

import editor.Editor;
import figuras.Figure;
import figuras.Triangulo;
import modifica.ModificacionCreacion;

public class CreacionTriangulo implements Herramienta {

	private int vertices = 0;
	private Point[] vertice = new Point[3];
	private Editor editor;

	public CreacionTriangulo(Editor editor) {
		this.editor = editor;
		
	}

	@Override
	public void pinchar(int x, int y) {
		vertice[vertices++] = new Point(x,y);
		if (vertices == 3) {
			Figure figura = new Triangulo(vertice[0].x, vertice[0].y, vertice[1].x, vertice[1].y, vertice[2].x, vertice[2].y);
			editor.getDibujo().addFigura(figura);
            editor.getHistorial().addDeshacer(new ModificacionCreacion(figura, editor));
			vertices = 0;
			editor.finHerramienta();
		}
		
	}

	@Override
	public void mover(int x, int y) {
		
	}


	@Override
	public void soltar(int x, int y) {
		
	}

}
