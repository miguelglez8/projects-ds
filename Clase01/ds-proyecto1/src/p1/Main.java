package p1;

public class Main {
	// distintas versiones en el pdf
	public static void main(String[] args) {
		Temperaturas[] temperaturas = new Temperaturas[100];

		// Toma de datos
		for (int i = 0; i < temperaturas.length; i++) {
			temperaturas[i] = new Temperaturas();
			temperaturas[i].setCelsius(leeSensorCelsius());
		}
		
		// C�lculo con los datos en Celsius
		double mediaCelsius = 0;
		for (int i = 0; i < temperaturas.length; i++) {
			mediaCelsius += temperaturas[i].getCelsius();
		}
		mediaCelsius = mediaCelsius / temperaturas.length;
		System.out.println(mediaCelsius);


		// C�lculo con los datos en Fahrenheit
		double mediaFahrenheit = 0;
		for (int i = 0; i < temperaturas.length; i++)
			mediaFahrenheit += temperaturas[i].getFar();
		mediaFahrenheit = mediaFahrenheit / temperaturas.length;
		System.out.println(mediaFahrenheit);

		// Otro c�lculo con los datos en Fahrenheit
		double varianza = 0;
		for (int i = 0; i < temperaturas.length; i++)
			varianza += Math.pow((temperaturas[i].getFar()) - mediaFahrenheit, 2);
		varianza = varianza / temperaturas.length;
		System.out.println(varianza);
	}

	public static double leeSensorCelsius() {
		return Math.random() * 30;
	}
	
}
