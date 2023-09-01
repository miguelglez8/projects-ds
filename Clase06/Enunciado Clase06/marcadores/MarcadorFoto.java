package marcadores;

import google.maps.Coordenadas;
import google.maps.Marcador;
import model.Foto;

public class MarcadorFoto implements Marcador {
	private Foto res;
	
	public MarcadorFoto(Foto r) {
		this.res=r;
	}
	
	@Override
	public Coordenadas getCoordenadas() {
		return res.getCoordenadas();
	}

	@Override
	public String getTooltipInfo() {
		return "USUARIO = " + res.getUsuario() + ", DESCRIPCION = " + res.getDescripcion();
	}

	@Override
	public void abrir() {
		res.descargar();
	}

}
