package instructions;
import vm.*;

public class Store extends AbstractInstruction {

	@Override
	protected void doExecute(State state) {
		int valor = state.pop();
		int direction = state.pop();

		state.write(direction, valor);
	}
}
