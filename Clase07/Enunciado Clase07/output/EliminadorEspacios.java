package output;

import java.io.IOException;

public class EliminadorEspacios implements Output {
	
	private Output output;
	private char ch;
	
	public EliminadorEspacios(Output output) {
		this.output = output;
	}

	@Override
	public void send(char c) throws IOException {
		if (c == ' ' && ch == ' ') {
			return;
		}
		output.send(c);
		ch = c;
	}

	@Override
	public void close() throws IOException {
		output.close();
	}

}
