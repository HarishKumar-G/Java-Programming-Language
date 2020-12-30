/*
 * Java program to illustrate the concept of IslandOfIsolation
 */

public class Island_Of_Isolation {
	
	Island_Of_Isolation i;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Island_Of_Isolation obj1 = new Island_Of_Isolation();
		Island_Of_Isolation obj2 = new Island_Of_Isolation();
		
		// Object of obj1 gets a copy of obj2
		obj1.i = obj2;
		
		// Object of obj2 gets a copy of obj1
		obj2.i = obj1;
		
		// Till now no object eligible for Garbage Collection
		obj1 = null;
		
		// now two objects are eligible for garbage collection
		obj2 = null;
		
		// calling garbage collector
		System.gc();
	}
	
	@Override
	protected void finalize() throws Throwable {
		System.out.println("Finalize method called");
	}
}
