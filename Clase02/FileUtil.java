import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class FileUtil {
	
    private static List<String[]> instrucciones = new ArrayList<String[]>();

	public static List<String[]> procesaFichero(String n) throws Exception {
		BufferedReader fichero = new BufferedReader(new FileReader(n));

        String linea;
        while ((linea = fichero.readLine()) != null)
            cargaInstruccion(linea);
        fichero.close();
        return instrucciones;
	}
	
	private static void cargaInstruccion(String linea) {
        if (linea.trim().length() == 0)
            return;

        String[] palabras = linea.split(" ");
        String[] e = new String[2];
        if (palabras.length==1) {
        	e[0]=palabras[0];
        } else {
        	e[0] = palabras[0];
            e[1] = palabras[1];
        }
        instrucciones.add(e);
    }


}
