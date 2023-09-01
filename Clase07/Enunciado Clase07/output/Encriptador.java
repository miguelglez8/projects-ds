package output;

import java.io.IOException;

public class Encriptador implements Output {

	private Output output;

	public Encriptador(Output output) {
		this.output = output;
	}

	@Override
	public void send(char c) throws IOException {
		output.send(encripta(c));
    }

	private char encripta(char c) {
		if (Character.isLetterOrDigit(c)) {
			return (char) (c + 1);
		} else {
			return c;
		}
	}

	@Override
	public void close() throws IOException {
		output.close();
	}
}
