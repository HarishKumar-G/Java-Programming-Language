import java.util.*;

public class Set3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String mydelim = " : ";
		String mystr = "JAVA : Code : String : Tokenizer : Geeks";
		
		StringTokenizer geeks = new StringTokenizer(mystr, mydelim);
		int count = geeks.countTokens();
		System.out.println("Number of tokens : " + count);
		
		while(geeks.hasMoreElements())
			System.out.println(geeks.nextElement());
	}
}
