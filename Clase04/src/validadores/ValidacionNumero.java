package validadores;
public class ValidacionNumero implements Validador {
	

	@Override
	public boolean validador(String texto) {
		for (char ch : texto.toCharArray()) {
			if (!Character.isDigit(ch)) {
				return false;
			}
		}
		return true;
	}

	
}
