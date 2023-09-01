package output;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Copiador implements Output {
	
	// CON AMPLIACIÓN
	private List<Output> output = new ArrayList<>();

	public Copiador(Output ... outputs) {
		for (Output a: outputs) {
			output.add(a);
		}
	}

	@Override
	public void send(char c) throws IOException {
		for (Output a: output) {
			a.send(c);
		}
	}

	@Override
	public void close() throws IOException {
		for (Output a: output) {
			a.close();
		}
	}

}
