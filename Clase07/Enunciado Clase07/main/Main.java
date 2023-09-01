/**
 * # IMPORTANTE: El código entregado para esta práctica es el mínimo necesario para entender
 * el ejercicio y NUNCA debería ser tomado como un ejemplo del uso adecuado de excepciones,
 * asertos y tests. Todo lo anterior, que debería hacerse en un programa real, se ha omitido
 * a propósito para simplificar el planteamiento del ejercicio.
 */

package main;

import java.io.*;

import fileSystem.FileSystem;
import output.BluetoothOutput;
import output.CalculadorFirma;
import output.ContadorCaracteres;
import output.Copiador;
import output.EliminadorEspacios;
import output.Encriptador;
import output.FileOutput;
import output.InternetOutput;
import output.Normalizador;

public class Main {

    public static void main(String[] args) throws IOException {
        FileSystem fs = new FileSystem();
        System.out.println("Hola");
        fs.copy("privado.txt", new Normalizador(new FileOutput("copia.txt")));
        fs.copy("privado.txt", new Encriptador(new InternetOutput("1.1.1.1")));
        fs.copy("privado.txt", new EliminadorEspacios(new Encriptador(new BluetoothOutput("iPhone"))));
        // eliminar espacios
        
        // CASO 1
     	// Caso sin encriptar
     	fs.copy("privado.txt", new Normalizador(new FileOutput("a.txt")));
     	// Caso encriptado
     	fs.copy("privado.txt", new Encriptador(new Normalizador(new FileOutput("b.txt"))));
     	
     	// CASO 2
		// Caso normalizado
		fs.copy("privado.txt", new Normalizador(new Encriptador(new InternetOutput("1.1.1.1"))));
		// Caso Eliminados espacios
		fs.copy("privado.txt", new EliminadorEspacios(new Encriptador(new InternetOutput("1.1.1.2"))));
		// Caso normalizado y eliminado espacios
		fs.copy("privado.txt", new EliminadorEspacios(new Normalizador(new Encriptador(new InternetOutput("1.1.1.3")))));
		
		// CASO 3
		output.ContadorCaracteres contador;
		// Caso contar caracteres fileOutput normalizado
		fs.copy("privado.txt", new Normalizador(contador = new ContadorCaracteres(new FileOutput("copia.txt"))));
		System.out.println("Se han enviado " + contador.getCounter() + " caracteres");
		// Caso contar caracteres internetOutput encriptado
		fs.copy("privado.txt", new Encriptador(contador = new ContadorCaracteres(new InternetOutput("1.1.1.1"))));
		System.out.println("Se han enviado " + contador.getCounter() + " caracteres");
		// Caso contar caracteres BluetoothOutput eliminado espacios
		fs.copy("privado.txt", new EliminadorEspacios(new Encriptador(contador = new ContadorCaracteres(new BluetoothOutput("iPhone")))));
		System.out.println("Se han enviado " + contador.getCounter() + " caracteres");
		
		// CASO 4
		ContadorCaracteres contadorAntes;
		ContadorCaracteres contadorDespues;
		// Caso contar caracteres antes y despues fileOutput normalizado
		fs.copy("privado.txt", contadorAntes = new ContadorCaracteres(
				new Normalizador(contadorDespues = new ContadorCaracteres((new FileOutput("salida.txt"))))));
		System.out.println("Inicialmente hab�a " + contadorAntes.getCounter() + " caracteres");
		System.out.println("Despues de normalizar, se han enviado " + contadorDespues.getCounter() + " caracteres");
		// Caso contar caracteres antes y despues internetOutput encriptado
		fs.copy("privado.txt", contadorAntes = new ContadorCaracteres(
				new EliminadorEspacios(contadorDespues = new ContadorCaracteres((new InternetOutput("1.1.1.1"))))));
		System.out.println("Inicialmente hab�a " + contadorAntes.getCounter() + " caracteres");
		System.out.println("Despues de eliminar espacios, se han enviado " + contadorDespues.getCounter() + " caracteres");
		// Caso contar caracteres antes y despues BluetoothOutput eliminado espacios
		fs.copy("privado.txt", contadorAntes = new ContadorCaracteres(
				new Normalizador(new EliminadorEspacios(contadorDespues = new ContadorCaracteres((new BluetoothOutput("iPhone")))))));
		System.out.println("Inicialmente hab�a " + contadorAntes.getCounter() + " caracteres");
		System.out.println("Despues de normalizar y eliminar espacios, se han enviado " + contadorDespues.getCounter() + " caracteres");

		// CASO 5
		// Caso unir encriptacion a InternetOutput y BluetoothOutput
		fs.copy("privado.txt",
				new Encriptador(new Copiador(new InternetOutput("1.1.1.1"), new BluetoothOutput("Galaxy S"))));
		
		// AMPLIACIÓN
		// 1 - Caso escribir fichero normalizado en “a.txt” y además encriptado en “b.txt”
		fs.copy("privado.txt",
			(new Copiador(new Normalizador(new FileOutput("a.txt")), new Encriptador(new FileOutput("b.txt")))));
		
		// AMPLIACIÓN
		// 2 - Hacer todo lo que se pide para el Diseño de Referencia (página 2) sobre un mismo fichero de entrada “privado.txt” con una sola llamada a copy		
		fs.copy("privado.txt",
			(new Copiador(new Normalizador(new FileOutput("a.txt")), new Encriptador(new InternetOutput("1.1.1")), new EliminadorEspacios(new Encriptador(new BluetoothOutput("iPhone"))))));
		
		// AMPLIACIÓN
		// 3 - Que de un fichero se pueda calcular su firma MD5 (en nuestro caso, se simula simplemente sumando sus bytes). Encriptar “prueba.txt” y calcular su firma 
        // antes de enviarlo por Internet. Después imprimir su firma en pantalla.
		fs.copy("privado.txt",
			new Encriptador(new CalculadorFirma(new InternetOutput("1.1.1"))));
					
		
    }
}
