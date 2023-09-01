package validadores;

public class ValidacionTexto implements Validador {

	@Override
	public boolean validador(String texto) {
		for (char ch : texto.toCharArray()) {
			if (!Character.isLetter(ch)) {
				return false;
			}
		}
		return true;
	}
	

}
