package modifica;

import java.util.Stack;

public class Historial {
	
	private Stack<Modificacion> pilaDeshacer = new Stack<>(); //  saque el elemento superior de la pila Deshacer y emp�jelo a la pila Rehacer 
	private Stack<Modificacion> pilaRehacer = new Stack<>(); // saque el elemento superior de la pila Rehacer y emp�jelo hacia la pila Deshacer

	public void undo() {
		if (pilaDeshacer.isEmpty()) {
			System.out.println("Error, no puedes deshacer ninguna opci�n");
			return;
		} 
			Modificacion m = pilaDeshacer.pop();
			m.undo();
			pilaRehacer.push(m);
	}
	
	public void redo() {
		if (pilaRehacer.isEmpty()) {
			System.out.println("Error, no puedes rehacer ninguna opci�n");
			return;
		} 
			Modificacion m = pilaRehacer.pop();
			m.redo();
			pilaDeshacer.push(m);
	}

	public void addDeshacer(Modificacion modificacion) {
		pilaDeshacer.push(modificacion);
		pilaRehacer.clear();
	}
	
	

}
