package marcadores;

import google.maps.Coordenadas;
import google.maps.Marcador;
import google.maps.Navegador;
import model.Restaurante;

public class MarcadorRestaurante implements Marcador {
	
	private Restaurante res;
	
	public MarcadorRestaurante(Restaurante r) {
		this.res=r;
	}
	
	@Override
	public Coordenadas getCoordenadas() {
		return new Navegador().getCoordenadas(res.getDireccion());
	}

	@Override
	public String getTooltipInfo() {
		return "NOMBRE = " + res.getNombre() + ", TELEFONO = " + res.getTelefono();
	}

	@Override
	public void abrir() {
		res.llamar();
	}

	
}
