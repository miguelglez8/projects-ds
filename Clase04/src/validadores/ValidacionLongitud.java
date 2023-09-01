package validadores;

public class ValidacionLongitud implements Validador {
	
	private int longitud;
	
	public ValidacionLongitud(int longitud) {
		this.longitud=longitud;
	}

	@Override
	public boolean validador(String texto) {
		return texto.length()==longitud;
	}

}
