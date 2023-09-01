package output;

import java.io.IOException;
import java.io.StringWriter;

public class BluetoothOutput implements Output {
	
	private StringWriter writer;
	
	public BluetoothOutput(String string) throws IOException {
		writer = new StringWriter();
		writer.append("\n--- START. Conectando con Bluetooth[" + string + "]\n");
	}
     
	@Override
	public void send(char c) throws IOException {
		writer.append(c);
	}
	
	@Override
	public void close() throws IOException {
		System.out.print(writer.toString());
        System.out.println("--- END. Cerrando conexión Bluetooth");
	}

}
