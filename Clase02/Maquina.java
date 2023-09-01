import java.util.ArrayList;
import java.util.List;

public class Maquina {

	private static List<Instruccion> instrucciones = new ArrayList<Instruccion>();;
	private static Estado estado = new Estado();
	
	public Maquina(List<String[]> inst) {
		Instruccion in = null;
		for (int i=0; i < inst.size(); i++) {
			switch (inst.get(i)[0]) {
				case "push":
					in = new Push(estado);
					break;
				case "add":
					in = new Add(estado);
					break;
				case "sub":
					in = new Sub(estado);
					break;
				case "mul":
					in = new Mul(estado);
					break;
				case "store":
					in = new Store(estado);
					break;
				case "output":
					in = new Output(estado);
					break;
				case "input":
					in = new Input(estado);
					break;
				case "jmp":
					in = new Jmp(estado);
					break;
				case "jmpg":
					in = new Jmpg(estado);
					break;
				case "load":
					in = new Load(estado);
					break;
				default:
					break;
			}
			in.setTexto(inst.get(i));
			instrucciones.add(in);
		}
	}
	
	// motor de ejecución
	public void ejecutar() {
		while (true) {
			int pos = estado.getIndice();
			if (pos < instrucciones.size()) {
				Instruccion inst = instrucciones.get(pos);
		        inst.procesar(inst.getTexto());
			} else {
				break;
			}
		}
	}

}
