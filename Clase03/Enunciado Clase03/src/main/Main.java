/**
 * # IMPORTANTE: El código entregado para esta práctica es el mínimo necesario para entender
 * el ejercicio y NUNCA debería ser tomado como un ejemplo del uso adecuado de excepciones,
 * asertos y tests. Todo lo anterior, que debería hacerse en un programa real, se ha omitido
 * a propósito para simplificar el planteamiento del ejercicio.
 */

package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import editor.Dibujo;
import editor.Editor;
import herramientas.CreacionCirculo;
import herramientas.CreacionCuadrado;
import herramientas.CreacionTriangulo;
import herramientas.Herramienta;

public class Main {

    public static void main(String[] args) throws IOException {
        Main app = new Main();
        app.run();
    }
    
    private Herramienta circulo, triangulo, cuadrado;

    public void run() throws IOException {
        in = new BufferedReader(new InputStreamReader(System.in));
        Editor editor = new Editor(new Dibujo());

        System.out.println("Comandos Herramientas: cuadrado, circulo, triangulo, seleccion");
        System.out.println("Comandos Ratón: pinchar x,y / mover x,y / soltar x,y");
        System.out.println("Otros Comandos: dibujar, exit");
        
        creaHerramientas(editor);

        do {
            System.out.print(">");
            String[] line = in.readLine().split("[ ,]");
            procesaOpcion(editor, line);

        } while (true);
    }

	private void procesaOpcion(Editor editor, String[] line) {
		if (line[0].equals("exit"))
		    return;
		if (line[0].equals("cuadrado"))
		    editor.setHerramienta(cuadrado);
		else if (line[0].equals("circulo"))
		    editor.setHerramienta(circulo);
		else if (line[0].equals("triangulo"))
		    editor.setHerramienta(triangulo);
		else if (line[0].equals("seleccion"))
			editor.setHerramienta(editor.getDefault()); 
		else if (line[0].equals("pinchar")) {
		    int x = Integer.parseInt(line[1]);
		    int y = Integer.parseInt(line[2]);
		    editor.pinchar(x,y);
		} else if (line[0].equals("mover")) { // Esto es mover el ratón
		    int x = Integer.parseInt(line[1]);
		    int y = Integer.parseInt(line[2]);
		    editor.mover(x,y);
		} else if (line[0].equals("soltar")) {
		    int x = Integer.parseInt(line[1]);
		    int y = Integer.parseInt(line[2]);
		    editor.soltar(x,y);
		} else if (line[0].equals("dibujar"))
		    editor.dibujar();
		else
		    System.out.println("Comando no válido");
	}

    private BufferedReader in;
    
    private void creaHerramientas(Editor editor) {
    	circulo = new CreacionCirculo(editor);
		cuadrado = new CreacionCuadrado(editor);
		triangulo = new CreacionTriangulo(editor);
		
	}

}
