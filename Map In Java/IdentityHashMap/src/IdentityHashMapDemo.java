/*
 * Java code to illustrate identityHashMap and illustration of how it is different from HashMap
 */
import java.util.Map;
import java.util.HashMap;
import java.util.IdentityHashMap;

public class IdentityHashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Creating HashMap and identityHashMap objects
		Map hm = new HashMap();
		Map ihm = new IdentityHashMap();

		// Putting key and value in HashMap and identityHashMap Object
		hm.put("hmkey", "hmValue");
		hm.put(new String("hmkey"), "hmValue1");
		ihm.put("ihmkey", "ihmValue");
		ihm.put(new String("ihmkey"), "ihmValue1");

		/*
		 * Print size of HashMap and WeakHashMap Object
		 */
		System.out.println("Size of HashMap: " + hm.size());

		// ihm.size() will print 2 since it compares the objects by reference
		System.out.println("Size of identityHashMap: " + ihm.size());
	}
}
