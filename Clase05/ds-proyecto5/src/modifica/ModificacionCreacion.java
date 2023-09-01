package modifica;

import editor.Editor;
import figuras.Figure;

public class ModificacionCreacion implements Modificacion {
	
	private Figure figura;
	private Editor editor;

	public ModificacionCreacion(Figure figura, Editor editor) {
		this.figura=figura;
		this.editor=editor;
	}
	
	@Override
	public void undo() {
		editor.getDibujo().elimina(figura);
	}

	@Override
	public void redo() {
		editor.getDibujo().addFigura(figura);
	}

}
