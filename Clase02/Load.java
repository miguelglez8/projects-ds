
public class Load extends Instruccion {
	private Estado estado;

	public Load(Estado estado) {
		this.estado = estado;
	}
	
	public void procesar(String value) {
		estado.guardarPila(estado.getMemoria(estado.sacarPila()));
		estado.siguienteInstruccion();
	}
 

}
