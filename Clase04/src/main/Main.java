package main;

import campo.Campo;
import campo.Formulario;
import logica_validadores.ValidadorAnd;
import logica_validadores.ValidadorOr;
import validadores.ValidacionLongitud;
import validadores.ValidacionMayorQue;
import validadores.ValidacionMenorQue;
import validadores.ValidacionNumero;
import validadores.ValidacionTexto;
import validadores.Validador;
import validadores.ValidadorOpciones;

/**
 * # IMPORTANTE: El código entregado para esta práctica es el mínimo necesario para entender
 * el ejercicio y NUNCA debería ser tomado como un ejemplo del uso adecuado de excepciones,
 * asertos y tests. Todo lo anterior, que debería hacerse en un programa real, se ha omitido
 * a propósito para simplificar el planteamiento del ejercicio.
 */

public class Main {
	
	private static Validador codigoPostal = new ValidadorAnd(new ValidacionNumero(), new ValidacionLongitud(5));
	private static Validador edad = new ValidadorAnd(new ValidacionNumero(), new ValidacionMayorQue(18));
	private static Validador sueldo = new ValidadorAnd(new ValidacionNumero(), new ValidacionMayorQue(800), new ValidacionMenorQue(1200));
	private static Validador opciones = new ValidadorOpciones("Santander", "Oviedo", "Cadiz");
	private static Validador ubicacion = new ValidadorOr(opciones, codigoPostal);
	private static Validador numeroTresDigitos = new ValidadorAnd(new ValidacionNumero(), new ValidacionLongitud(3));
	private static Validador codigoPromocion = new ValidadorOr(new ValidacionTexto(), numeroTresDigitos);


    public static void main(String[] args) {
        Formulario formulario = new Formulario();
        
        formulario.addCampo(new Campo("Nombre",new ValidacionTexto()));
        formulario.addCampo(new Campo("Apellido", new ValidacionTexto()));
        formulario.addCampo(new Campo("Telefono", new ValidacionNumero()));
        formulario.addCampo(new Campo("Ciudad", opciones)); 
        formulario.addCampo(new Campo("Codigo de productos", new ValidacionLongitud(4)));
        formulario.addCampo(new Campo("Codigo postal", codigoPostal));
        formulario.addCampo(new Campo("Edad", edad)); 
        formulario.addCampo(new Campo("Sueldo", sueldo));
        formulario.addCampo(new Campo("Ubicacion", ubicacion)); 
        formulario.addCampo(new Campo("Codigo promocion", codigoPromocion)); 
        
        formulario.pideDatos();
    }


}
