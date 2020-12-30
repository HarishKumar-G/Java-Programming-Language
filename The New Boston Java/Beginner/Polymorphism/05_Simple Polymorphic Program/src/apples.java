
public class apples {

	public static void main(String[] args) {
		
		Animal[] theList = new Animal[2];
		Dog d = new Dog();
		Fish f = new Fish();
		
		theList[0] = d;
		theList[1] = f;
		
		for(Animal x : theList){
			x.noise();
		}
	}
}
