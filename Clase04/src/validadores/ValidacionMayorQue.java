package validadores;

public class ValidacionMayorQue implements Validador {
	
	private int mayor;
	
	public ValidacionMayorQue(int mayor) {
		this.mayor=mayor;
	}

	public boolean validador(String texto) {
		return Integer.parseInt(texto) > mayor;
	}

}
