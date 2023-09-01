package editor;

import herramientas.Herramienta;
import herramientas.Seleccion;

public class Editor {

	private Herramienta actual;
	    
	public Editor(Dibujo dibujo) {
		setDibujo(dibujo);
		actual=principal=getDefault();
	}

	public void setDibujo(Dibujo dibujo) {
		this.dibujo = dibujo;
	}

	public Dibujo getDibujo() {
		return dibujo;
	}

	private Dibujo dibujo;
	private Herramienta principal;

	public void dibujar() {
		System.out.println("Boton activo -> " + actual); 
		dibujo.dibujar();
	}	
	
	public void pinchar(int x, int y) {
		actual.pinchar(x, y);
	}

	public void mover(int x, int y) {
		actual.mover(x, y);
	}

	public void soltar(int x, int y) {
		actual.soltar(x, y);
	}

	public void setHerramienta(Herramienta herramienta) {
		this.actual=herramienta;
	}

	public void finHerramienta() {
        actual = principal;
    }
	
	public Herramienta getDefault() {
		return new Seleccion(this);
	}

	

	
}
