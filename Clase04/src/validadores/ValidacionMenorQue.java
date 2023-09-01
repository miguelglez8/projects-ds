package validadores;

public class ValidacionMenorQue implements Validador {
	
	private int menor;
	
	public ValidacionMenorQue(int menor) {
		this.menor=menor;
	}

	public boolean validador(String texto) {
		return Integer.parseInt(texto) < menor;
	}

	

}
