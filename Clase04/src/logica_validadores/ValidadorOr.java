package logica_validadores;

import validadores.Validador;

public class ValidadorOr implements Validador {

	private Validador[] v;

	public ValidadorOr(Validador... v) {
		this.v=v;
	}

	@Override
	public boolean validador(String texto) {
		for (int i=0; i < v.length; i++) {
			if (v[i].validador(texto)==true) {
				return true;
			}
		}
		return false;
	}

}
