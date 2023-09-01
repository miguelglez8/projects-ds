package editor;

import java.util.ArrayList;
import java.util.List;

import figuras.Figure;

public class Dibujo {
	private List<Figure> lista = new ArrayList<Figure>();
	
	public List<Figure> getLista() {
		return lista;
	}

	public void addFigura(Figure figura) {
		lista.add(figura);
	}
	
	public void dibujar() {
		for (int i=0; i < lista.size(); i++) {
			lista.get(i).dibujar();
		}
	}
	
	public Figure getFigure(int x, int y) {
		for (int i=0; i < lista.size(); i++) {
			if (lista.get(i).contiene(x, y)) {
				return lista.get(i);
			}
		}
		return null;
	}

}
