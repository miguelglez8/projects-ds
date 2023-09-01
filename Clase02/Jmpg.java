
public class Jmpg extends Instruccion {
	
	private Estado estado;

	public Jmpg(Estado estado) {
		this.estado = estado;
	}
	public void procesar(String value) {
		int a = estado.sacarPila();
		int b = estado.sacarPila();
		if (a > b) {
			estado.salto(Integer.parseInt(value));
		} else {
			estado.siguienteInstruccion();
		}
	}

}
