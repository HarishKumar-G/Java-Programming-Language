/* Base class vehicle */
	class Vehicle {
		int maxSpeed = 120;
	}

/* sub class Car extending vehicle */
	class Car extends Vehicle {
		int maxSpeed = 180;
		
		void display() {
			System.out.println("Maximum Speed: " + super.maxSpeed);
		}
	}

/* Driver program to test */
public class Example1 {	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car small = new Car();
		small.display();
	}
}
