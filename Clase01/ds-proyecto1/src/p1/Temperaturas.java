package p1;

public class Temperaturas {
	private double celsius;
	private double far;
	private boolean usoCelsius;
	private boolean usoFar;
	
	public void setCelsius(double temp) {
		this.celsius = temp;
		usoCelsius = true;
		usoFar = false;
	}
	
	public void setFar(double temp) {
		this.far = temp;
		usoFar = true;
		usoCelsius = false;
	}
	
	public double getCelsius() {
		if (! usoCelsius) {
			usoCelsius = true;
			celsius = (far - 32) / 1.8;
		}
		return celsius;
	}

	
	public double getFar() {
		if (! usoFar) {
			usoFar = true;
			far = celsius * 1.8 + 32;
		}
		return far;
	}
}
