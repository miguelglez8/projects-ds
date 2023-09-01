package output;

import java.io.IOException;

public class CalculadorFirma implements Output {
	
	private Output output;
	private byte bytes;

	public CalculadorFirma(Output internetOutput) {
		this.output=internetOutput;
	}

	@Override
	public void send(char c) throws IOException {
		bytes+=(byte)c;
		output.send(c);
	}

	@Override
	public void close() throws IOException {
		System.out.println("Firma MD5 = " + bytes);
		output.close();
	}

}
