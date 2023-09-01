
public class Push extends Instruccion {

	private Estado estado;

	public Push(Estado estado) {
		this.estado = estado;
	}
	
	public void procesar(String value) {
		estado.guardarPila(Integer.parseInt(value));
		estado.siguienteInstruccion();
	}
	

}
