/*
 * Java code illustrating entrySet(), keySet(), and Values()
 */
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;

public class WeakHashMap_Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<Number, String> weak = new WeakHashMap<Number, String>();
		
		weak.put(1, "geeks");
		weak.put(2, "for");
		weak.put(3, "geeks");
		
		Set set1 = weak.entrySet();
		// checking set
		System.out.println(set1);
		
		
		// creating set for key
		Set keySet = weak.keySet();
		// checking keySet
		System.out.println("key set: " + keySet);
		
		
		Collection value = weak.values();
		// checking values of map
		System.out.println("Values: " + value);

	}
}
