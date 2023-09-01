
public class Jmp extends Instruccion {
	private Estado estado;

	public Jmp(Estado estado) {
		this.estado = estado;
	}
	public void procesar(String value) {
		estado.salto(Integer.parseInt(value));
	}

}
