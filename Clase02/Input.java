import java.util.Scanner;

public class Input extends Instruccion {
	private static Scanner console = new Scanner(System.in);
	private Estado estado;

	public Input(Estado estado) {
		this.estado = estado;
	}
	public void procesar(String value) {
		System.out.println("Escriba un entero:");
		estado.guardarPila(console.nextInt());
		estado.siguienteInstruccion();
	}

}
