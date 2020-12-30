/*
 * Java code remove(), putAll(), get() and size() methods
 */

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;

public class WeakHashMap_Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<Number, String> weak = new WeakHashMap<Number, String>();
		weak.put(1, "geeks");
		weak.put(2, "for");
		weak.put(3, "geeks");
		
		Map<Number, String> weak1 = new WeakHashMap<Number, String>();
		weak1.putAll(weak);
		
		// getting values of key2
		System.out.println(weak1.get(2));
		
		// size of map
		System.out.println("Size of map is: " + weak1.size());
		
		// removing second element
		weak1.remove(2);
		
		// size after removing key and value pair
		System.out.println("Size after removing: " + weak1.size());
	}
}
