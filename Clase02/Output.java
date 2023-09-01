
public class Output extends Instruccion {
	private Estado estado;

	public Output(Estado estado) {
		this.estado = estado;
	}
	public void procesar(String value) {
		System.out.println(estado.sacarPila());
		estado.siguienteInstruccion();
	}
}
