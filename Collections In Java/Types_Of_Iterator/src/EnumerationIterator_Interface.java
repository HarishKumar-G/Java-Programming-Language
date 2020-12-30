
import java.util.Vector;
import java.util.Enumeration;

public class EnumerationIterator_Interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vector dayNames = new Vector();
		
		dayNames.add("Sunday");
		dayNames.add("Monday");
		dayNames.add("Tuesday");
		dayNames.add("Wednesday");
		dayNames.add("Thursday");
		dayNames.add("Friday");
		dayNames.add("Saturday");
		
		// creating enumeration
		Enumeration days = dayNames.elements();
		
		// Retrieving elements of enumeration
		while(days.hasMoreElements()) {
			System.out.println(days.nextElement());
		}
	}
}
