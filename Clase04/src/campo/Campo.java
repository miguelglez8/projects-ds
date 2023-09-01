package campo;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import validadores.Validador;

public class Campo {
	
    private String texto;
    private String etiqueta;
    private Validador validacion;
	
	public Campo(String etiqueta, Validador c) {
		this.validacion=c;
		this.etiqueta=etiqueta;
	}

	public String getDato() {
		return texto;
	}
	
	public void pideDato() {
        BufferedReader consola = new BufferedReader(new InputStreamReader(System.in));

        do {
            try {
                System.out.print(etiqueta + ": ");
                texto = consola.readLine();
            } catch (IOException ex) {
                System.out.println(ex);
            }
        } while (!validacion.validador(texto));
    }
	
	
	
}
