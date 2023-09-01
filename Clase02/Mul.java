
public class Mul extends Instruccion {
	private Estado estado;

	public Mul(Estado estado) {
		this.estado = estado;
	}


	public void procesar(String value) {
		int a = estado.sacarPila();
		int b = estado.sacarPila();
		estado.guardarPila(a * b);
		estado.siguienteInstruccion();
	}

}
