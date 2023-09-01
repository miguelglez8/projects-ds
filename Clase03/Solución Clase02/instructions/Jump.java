package instructions;
import vm.*;

public class Jump implements Instruction {
	public Jump(int direction) {
		this.direction = direction;
	}

	@Override
	public void execute(State state) {
		state.setIP(direction);
	}

	private int direction;
}
