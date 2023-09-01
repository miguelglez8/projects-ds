
public abstract class Instruccion {
	private String[] texto;	
	public void setTexto(String[] texto) {
		this.texto = texto;
	}
	public abstract void procesar(String value);
	public String getTexto() { return texto.length==1 ? null : texto[1]; }
}
