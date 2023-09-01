package validadores;

public class ValidadorOpciones implements Validador {
	
	public ValidadorOpciones(String... valores) {
		this.valores = valores;
	}
	
	@Override
	public boolean validador(String texto) {
		for (String valor : valores)
			if (texto.toLowerCase().equals(valor.toLowerCase()))
				return true;
		return false;
	}
	
	private String[] valores;
	

}
