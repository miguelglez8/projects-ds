package logica_validadores;

import validadores.Validador;

public class ValidadorAnd implements Validador {
	private Validador[] v;

	public ValidadorAnd(Validador... v) {
		this.v=v;
	}

	@Override
	public boolean validador(String texto) {
		for (int i=0; i < v.length; i++) {
			if (v[i].validador(texto)==false) {
				return false;
			}
		}
		return true;
	}

}
