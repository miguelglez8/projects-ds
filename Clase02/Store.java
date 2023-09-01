
public class Store extends Instruccion {
	private Estado estado;

	public Store(Estado estado) {
		this.estado = estado;
	}
	
	public void procesar(String value) {
		int valor = estado.sacarPila();
		int pos = estado.sacarPila();
		estado.saveMemoria(valor, pos);
		estado.siguienteInstruccion();
	}
}
