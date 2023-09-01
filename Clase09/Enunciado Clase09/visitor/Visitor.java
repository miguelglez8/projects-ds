package visitor;

import nodos.Asignacion;
import nodos.ConstanteInt;
import nodos.Division;
import nodos.Print;
import nodos.Producto;
import nodos.Programa;
import nodos.Read;
import nodos.Suma;
import nodos.Variable;

public interface Visitor {
	Object visit(Programa p, Object param);
	Object visit(Asignacion p, Object param);
	Object visit(Print p, Object param);
	Object visit(Read p, Object param);
	Object visit(Variable p, Object param);
	Object visit(ConstanteInt p, Object param);
	Object visit(Division p, Object param);
	Object visit(Producto p, Object param);
	Object visit(Suma p, Object param);
}
