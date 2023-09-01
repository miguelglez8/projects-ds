package instructions;
import vm.*;

public class Load extends AbstractInstruction {

	protected void doExecute(State state) {
		state.push(state.read(state.pop()));
	}
}
