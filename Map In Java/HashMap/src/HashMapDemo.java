/*
 * Java program to illustrate java.util.HashMap
 */
import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
	public static void main(String args[]) {
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		
		print(map);
		map.put("Vishal", 10);
		map.put("Harish", 20);
		map.put("Kumar", 30);
		
		System.out.println("Size of map is: " + map.size());
		
		System.out.print("HashMap: ");
		print(map);
		if (map.containsKey("Vishal"))
		{
			Integer a = map.get("Vishal");
			System.out.println("Value for key" + "\"Vishal\" is :" + a);
		}
	
	map.clear();
	print(map);
	}
	
	public static void print(Map<String, Integer> map) {
		if(map.isEmpty())
			System.out.println("map is empty");
		else
			System.out.println(map);
	}
}
