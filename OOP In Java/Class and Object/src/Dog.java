
public class Dog {
	String name, breed, color;
	int age;
	
	// constructor of class Dog
	public Dog(String name, String breed, int age, String color){
		this.name = name;
		this.breed = breed;
		this.age = age;
		this.color = color;
	}
	
	// getter methods
	public String getName() {
		return name;	
	}
	
	public String getBreed(){
		return breed;
	}
	
	public int getAge(){
		return age;
	}
	
	public String getColor(){
		return color;
	}
	
	@Override
	public String toString(){
		return ("Hi, my name is " + this.getName() + ".\nMy breed, age, color are: " 
				+ this.getBreed() + "," + this.getAge() + "," + this.getColor());
	}
	
	public static void main(String args[]){
		Dog tuffy = new Dog("Tuffy", "Papillon", 5, "White");
		System.out.println(tuffy.toString());
	}
}
