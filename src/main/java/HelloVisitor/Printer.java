package HelloVisitor;

public class Printer implements Visitor {

	@Override
	public void visit(Person v) {
		// TODO Auto-generated method stub
		System.out.println(v.getAge());
		System.out.println(v.getName());
	}
	
	@Override
	public void visit(Student v) {
		// TODO Auto-generated method stub
		System.out.println(v.getAge());
		System.out.println(v.getName());
		System.out.println(v.getSubject());     
	}
}
