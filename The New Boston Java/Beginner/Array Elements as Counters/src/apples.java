import java.util.Random;

public class apples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random rand = new Random();
		int freq[] = new int[7];
		
		for(int i = 0; i<1000; i++)
			++freq[1+rand.nextInt(6)];
		
		System.out.println("Face\tFrequency");
		for(int face = 1; face < freq.length; ++face)
			System.out.println(face + "\t" + freq[face]);
	}
}
