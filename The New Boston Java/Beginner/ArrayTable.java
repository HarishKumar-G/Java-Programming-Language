class apples{
	public static void main(String args[]){
		System.out.println("Index\tValue");

		int bucky[] = {32, 12, 43, 18, 54, 9};

		for(int counter = 0; counter < bucky.length; counter++){
			System.out.println(counter + "\t" + bucky[counter]);
		}
	}
}