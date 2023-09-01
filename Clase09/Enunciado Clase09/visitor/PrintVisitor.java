package visitor;

import nodos.Asignacion;
import nodos.ConstanteInt;
import nodos.Division;
import nodos.Print;
import nodos.Producto;
import nodos.Programa;
import nodos.Read;
import nodos.Sentencia;
import nodos.Suma;
import nodos.Variable;

public class PrintVisitor implements Visitor {

	public Object visit(Programa prog, Object param) {
		for (Sentencia sent : prog.sentencias)
			sent.accept(this, null);
		return null;
	}
		
	public Object visit(Print print, Object param) {
		System.out.print("print ");
		print.expr.accept(this, null);
		System.out.println(";");
		return null;
	}
		
	public Object visit(Read read, Object param) {
		System.out.print("read ");
		read.var.accept(this, null);
		System.out.println(";");
		return null;	
	}
	
	@Override
	public Object visit(Asignacion p, Object param) {
		p.variable.accept(this, null);
		System.out.print(" = ");
		p.expr.accept(this, null);
		System.out.println(";");
		return null;	
	}
		
	public Object visit(Suma suma, Object param) {
		suma.left.accept(this, null);
		System.out.print(" + ");
		suma.right.accept(this, null);
		return null;	
	}
	
	@Override
	public Object visit(Division p, Object param) {
		p.left.accept(this, null);
		System.out.print(" / ");
		p.right.accept(this, null);
		return null;
	}

	@Override
	public Object visit(Producto p, Object param) {
		p.left.accept(this, null);
		System.out.print(" * ");
		p.right.accept(this, null);
		return null;
	}
		
	public Object visit(Variable var, Object param){
		System.out.print(var.name);
		return null;
	}

	@Override
	public Object visit(ConstanteInt p, Object param) {
		System.out.print(p.valor);
		return null;
	}

	

}
