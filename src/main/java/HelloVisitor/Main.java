package HelloVisitor;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Person s=new Person("Daljeet",35);
         Visitor v=new Printer();
         s.accept(v);
         
         Person s2=new Student("Daljeet",31,"Hindi");
         s2.accept(v);
         
         
	}

}
