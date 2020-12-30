
public class Main1 {
	
	public static class SuperClass {
		void print(){
			System.out.println("print in superclass");
		}
	}
	
	public static class SubClass {
		void print(){
			System.out.println("print in subclass");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SuperClass a = new SuperClass();
		SubClass b = new SubClass();
		
		a.print();
		b.print();
	}

}
