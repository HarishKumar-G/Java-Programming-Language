
class Emp {
	public static double salary;
	public static String name = "HARSH";
}

public class staticVariables {
	public static void main(String args[]){
		Emp.salary = 1000;
		System.out.println(Emp.name + "'s salary: " + Emp.salary);
	}
}
