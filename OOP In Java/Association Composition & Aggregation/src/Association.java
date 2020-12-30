/* Association is the relation between two separate classes which establishes through their Objects */

class Organization{
	private String name;
	
	Organization(String name){
		this.name = name;
	}
	
	public String getOrganizationName(){
		return this.name;
	}
}

class Employee {
	private String name;
	
	Employee(String name){
		this.name = name;
	}
	
	public String getEmployeeName(){
		return this.name;
	}
}

public class Association {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Organization org = new Organization("NXP Semiconductors inc.");
		Employee emp = new Employee("Harish");
		
		System.out.println(emp.getEmployeeName() + " is an employee of " + org.getOrganizationName());
	}

}
