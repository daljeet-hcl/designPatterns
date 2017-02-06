package HelloVisitor;

public interface Visitor {

	public void visit(Person v);

	void visit(Student v);
	
}
