import java.util.StringTokenizer;

public class Set1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Using constructor 1 - ");
		StringTokenizer st1 = new StringTokenizer("Hello, how are you?", " ");
		while(st1.hasMoreTokens())
			System.out.println(st1.nextToken());
		
		System.out.println("Using constructor 2 - ");
		StringTokenizer st2 = new StringTokenizer("JAVA : Code : String");
		while(st2.hasMoreTokens())
			System.out.println(st2.nextToken());
		
		System.out.println("Using constructor 3 - ");
		StringTokenizer st3 = new StringTokenizer("JAVA : Code : String", " :", true);
		while(st3.hasMoreTokens())
			System.out.println(st3.nextToken());
	}
}
