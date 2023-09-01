package encuesta;

import java.util.ArrayList;
import java.util.List;

import actualizable.Actualizable;

public class Encuesta {

    private int si, no;
    private String pregunta;
    List<Actualizable> lista = new ArrayList<>();

    public Encuesta(String pregunta) {
        this.pregunta = pregunta;
    }
    
    public void añadirActualizable(Actualizable a) {
    	lista.add(a);
    }
    
    public void eliminarActualizable(int index) {
    	lista.remove(index);
    }
    
    public void actualizar() {
    	for (Actualizable e: lista) {
    		e.actualizar(this);
    	}
    }
    
    public String getPregunta() {
        return pregunta;
    }

    public int getVotosSi() {
        return si;
    }

    public int getVotosNo() {
        return no;
    }

    public void incrementaSi() {
        si++;
        actualizar();
    }

    public void incrementaNo() {
        no++;
        actualizar();
    }

	public void resetear() {
		this.si=0;
		this.no=0;
	}

}
