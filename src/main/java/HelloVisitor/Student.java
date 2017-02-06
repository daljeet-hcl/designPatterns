package HelloVisitor;

public class Student extends Person {

	private String subject;
	
	public Student(String name, int age,String subject) {
		super(name, age);
		this.setSubject(subject);
		// TODO Auto-generated constructor stub
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	@Override
	public void accept(Visitor v) {
		// TODO Auto-generated method stub
		v.visit(this);
	}
	
	
}
