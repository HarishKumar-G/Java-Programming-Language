import java.util.*;

public class Set2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String mydelim = " : ";
		String mystr = "JAVA : Code : String : Tokenizer : Geeks";
		
		StringTokenizer gk = new StringTokenizer(mystr);
		while (gk.hasMoreTokens())
			System.out.print(gk.nextToken() + " ");
		
		StringTokenizer geek3 = new StringTokenizer(mystr, mydelim);
		int count = geek3.countTokens();
		System.out.println("No. of tokens : " + count + "\n");
		
		for(int i = 0; i < count; i++)
			System.out.println("token at [" + i + "] :" + geek3.nextToken());
		
		while (geek3.hasMoreTokens())
			System.out.println(geek3.nextToken());
	}
}
