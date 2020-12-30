/* Java program to demonstrate working of 
 * hashCode() and toString() */
public class Student {

	static int last_roll = 100;
	int roll_no;
	
	// constructor
	Student(){
		roll_no = last_roll;
		last_roll++;
	}
	
	@Override
	public int hashCode(){
		return roll_no;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s = new Student();
		
		System.out.println(s);
		System.out.println(s.toString());
	}

}
