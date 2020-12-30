// Example for encapsulation in java

class Encapsulate{
	private String geekName;
	private int geekAge;
	private int geekRoll;
	
	public int getAge(){
		return geekAge;
	}
	public String getName(){
		return geekName;
	}
	public int getRoll(){
		return geekRoll;
	}
	
	public void setAge(int newAge){
		geekAge = newAge;
	}
	public void setName(String newName){
		geekName = newName;
	}
	public void setRoll(int newRoll){
		geekRoll = newRoll;
	}
}

public class TestEncapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Encapsulate obj = new Encapsulate();
		
		obj.setName("Harish");
		obj.setAge(22);
		obj.setRoll(7141);
		
		System.out.println("Geek's name: " + obj.getName());
		System.out.println("Geek's age: " + obj.getAge());
		System.out.println("Geek's roll: " + obj.getRoll());
	}
}
