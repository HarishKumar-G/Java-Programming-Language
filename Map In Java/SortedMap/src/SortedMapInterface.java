/*
 * Java code to demonstrate SortedMap
 */
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMapInterface {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SortedMap<Integer, String> sm = new TreeMap<Integer, String>();
		
		sm.put(new Integer(2), "Practice");
		sm.put(new Integer(3), "Quiz");
		sm.put(new Integer(4), "Code");
		sm.put(new Integer(4), "Contribute");
		sm.put(new Integer(5), "GeeksForGeeks");
		
		Set s = sm.entrySet();
		
		// Using iterator in sortedMap
		Iterator i = new s.iterator();
		
		// Traversing map. Note that the traversal produced sorted (by keys) output.
		while(i.hasNext())
		{
			Map.Entry m = (Map.Entry)i.next();
			
			int key = (Integer)m.getKey();
			String value = (String)m.getValue();
			
			System.out.println("Key :" + key + "Value :" + value);
		}
	}
}
