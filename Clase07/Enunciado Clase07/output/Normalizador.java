package output;

import java.io.IOException;

public class Normalizador implements Output {
	
	private Output output;

	public Normalizador(Output output) {
		this.output = output;
	}

	@Override
	public void send(char c) throws IOException {
		if (c != '\r') {
			output.send(c);
        }
	}

	@Override
	public void close() throws IOException {
		output.close();
	}

}
