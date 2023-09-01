package instructions;
import vm.*;

public class JumpGreater implements Instruction {
	public JumpGreater(int direction) {
		this.direction = direction;
	}

	@Override
	public void execute(State state) {
		int b = state.pop();
		int a = state.pop();
		if (a > b)
			state.setIP(direction);
		else
			state.setIP(state.getIP() + 1);
	}

	private int direction;
}
