package marcadores;

import google.maps.Coordenadas;
import google.maps.Marcador;
import google.maps.Navegador;
import model.Monumento;

public class MarcadorMonumento implements Marcador {
	private Monumento res;
	
	public MarcadorMonumento(Monumento r) {
		this.res=r;
	}
	
	@Override
	public Coordenadas getCoordenadas() {
		return new Navegador().getCoordenadas(res.getDireccion());
	}

	@Override
	public String getTooltipInfo() {
		return "NOMBRE = " + res.getNombre() + ", AUTOR = " + res.getAutor();
	}

	@Override
	public void abrir() {
		new Navegador().navegarHasta(res.getDireccion());
	}

}
