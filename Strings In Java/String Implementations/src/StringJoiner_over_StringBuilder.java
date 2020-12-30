// Java program to demonstrate use of StringJoiner class over StringBuilder class
import java.util.StringJoiner;

public class StringJoiner_over_StringBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// given string array
		String str[] = {"George", "Sally", "Fred"};
		
		// by using StringJoiner class
		// initializing StringJoiner instance with required delimiter, prefix and suffix
		StringJoiner sj = new StringJoiner(":", "[", "]");
		
		// concatenated strings
		sj.add("George").add("Sally").add("Fred");
		
		// converting StringJoiner to String
		String desiredString = sj.toString();
		
		System.out.println(desiredString);
		
		// declaring empty StringBuilder
		StringBuilder sb = new StringBuilder();
		
		// appending prefix
		sb.append("[");
		
		// checking for empty string array
		if(str.length > 0)
		{
			// appending first element
			sb.append(str[0]);
			
			//iterating through string array and appending required delimiter
			for (int i = 1; i < str.length; ++i)
			{
				sb.append(":").append(str[i]);
			}
		}
		
		// finally appending suffix
		sb.append("]");
		
		// converting StringBuilder to String
		String desiredString1 = sb.toString();
		System.out.println(desiredString1);
	}
}
