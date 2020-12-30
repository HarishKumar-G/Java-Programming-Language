
class Person {}
class Boy extends Person implements myInterface {}
interface myInterface {}

public class InstanceOfOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person obj1 = new Person();
		Person obj2 = new Boy();
		
		System.out.println("obj1 is the interfaceOf Person: " + (obj1 instanceof Person));
		System.out.println("obj1 is the interfaceOf Boy: " + (obj1 instanceof Boy));
		System.out.println("obj1 is the interfaceOf myInterface: " + (obj1 instanceof myInterface));
		
		System.out.println("\nobj2 is the interfaceOf Person: " + (obj2 instanceof Person));
		System.out.println("obj2 is the interfaceOf Boy: " + (obj2 instanceof Boy));
		System.out.println("obj2 is the interfaceOf myInterface: " + (obj2 instanceof myInterface));
	}
}
