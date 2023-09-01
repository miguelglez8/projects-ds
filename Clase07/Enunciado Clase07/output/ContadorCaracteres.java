package output;

import java.io.IOException;

public class ContadorCaracteres implements Output {
	
	private Output output;
	private int counter;
	
	public ContadorCaracteres(Output output) {
		this.output=output;
	}

	@Override
	public void send(char c) throws IOException {
		counter++;
		output.send(c);
	}

	@Override
	public void close() throws IOException {
		output.close();
	}

	public int getCounter() {
		return counter;
	}

}
