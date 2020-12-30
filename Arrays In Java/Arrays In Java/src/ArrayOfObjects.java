// Java program to illustrate creating an array of objects

class Student {
		public int roll_no;
		public String name;
		Student(int roll_no, String name){
			this.roll_no = roll_no;
			this.name = name;
		}
}

public class ArrayOfObjects {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student ary[] = new Student[5];
		
		ary[0] = new Student(1, "aman");
		ary[1] = new Student(2, "vaibhav");
		ary[2] = new Student(3, "shikar");
		ary[3] = new Student(4, "dharmesh");
		ary[4] = new Student(5, "mohit");
		
		for(int i = 0; i < ary.length; ++i){
			System.out.println("Element at " + i + " : " + ary[i].roll_no + " " + ary[i].name);
		}
	}
}
