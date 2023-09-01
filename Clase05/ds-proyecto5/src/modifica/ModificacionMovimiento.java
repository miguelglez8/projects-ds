package modifica;

import figuras.Figure;

public class ModificacionMovimiento implements Modificacion {

	private Figure figura;
	private int x;
	private int y;
	
	public ModificacionMovimiento(Figure figura, int x, int y) {
		this.x=x;
		this.y=y;
		this.figura=figura;
	}
	
	@Override
	public void undo() {
		figura.mover(-x, -y);
	}

	@Override
	public void redo() {
		figura.mover(x, y);
	}

}
