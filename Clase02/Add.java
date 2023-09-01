
public class Add extends Instruccion {
	
	private Estado estado;

	public Add(Estado estado) {
		this.estado = estado;
	}
	public void procesar(String value) {
		estado.guardarPila(estado.sacarPila() + estado.sacarPila());
		estado.siguienteInstruccion();
	}
	

}
