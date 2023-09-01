package output;

import java.io.IOException;
import java.io.StringWriter;

public class InternetOutput implements Output {
	
	private StringWriter writer;
	
	public InternetOutput(String string) throws IOException {
		writer = new StringWriter();
		writer.append("\n--- START. Conectando a Internet[" + string + "]\n");
	}
     
	@Override
	public void send(char c) throws IOException {
		writer.append(c);
	}
	@Override
	public void close() throws IOException {
		System.out.print(writer.toString());
        System.out.println("--- END. Cerrando conexión a Internet");
	}

}
