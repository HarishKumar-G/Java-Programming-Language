class Car1 {
	int model, no;
	
	Car1(int model, int no){
		this.model = model;
		this.no = no;
	}
	
	void print(){
		System.out.println("no = " + no + ", model = " + model);
	}
}

public class Main1 {
	
	public static void swap(Car1 c1, Car1 c2){
		Car1 temp = c1;
		c1 = c2;
		c2 = temp;
	}

	public static void main(String args[]){
		Car1 c1 = new Car1(101, 1);
		Car1 c2 = new Car1(202, 2);
		
		swap(c1, c2);
		
		c1.print();
		c2.print();
	}
}
