/**
 * # IMPORTANTE: El código entregado para esta práctica es el mínimo necesario para entender
 * el ejercicio y NUNCA debería ser tomado como un ejemplo del uso adecuado de excepciones,
 * asertos y tests. Todo lo anterior, que debería hacerse en un programa real, se ha omitido
 * a propósito para simplificar el planteamiento del ejercicio.
 */

import java.util.*;

public class Main {
    private static Maquina maquina;
 
    public static void main(String[] args) throws Exception {
    	List<String[]> instrucciones = FileUtil.procesaFichero("factorial.txt");
    	maquina = new Maquina(instrucciones);
    	maquina.ejecutar();
    }
    
}
