
public class apples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		food bucky[] = new food[2];
		
		bucky[0] = new tuna();
		bucky[1] = new potpie();
		
		for(int i = 0; i < bucky.length; i++){
			bucky[i].eat();
		}
	}
}
