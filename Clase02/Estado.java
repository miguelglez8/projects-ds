
public class Estado {
	
	private static int[] memoria;

	private static int[] pila;
	
    private static int indice;
    private static int indicePrograma;
    
    public Estado() {
    	memoria = new int[1024];
    	pila = new int[32];
    	indice = 0;
    	indicePrograma = 0;
    }

	public static int getIndice() {
		return indicePrograma;
	}
	
	public static int getMemoria(int pos) {
		return memoria[pos];
	}
	
	public static void saveMemoria(int value, int pos) {
		memoria[pos]=value;
	}

	
	public static void siguienteInstruccion() {
		indicePrograma++;
	}
	
	public static void salto(int paso) {
		indicePrograma = paso;
	}
	
	public static void guardarPila(int valor) {
		pila[indice] = valor;
		indice++;
	}

	public static int sacarPila() {
		indice--;
	    return pila[indice];
	}
	 
    

}
