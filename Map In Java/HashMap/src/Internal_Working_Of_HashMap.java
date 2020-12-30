/*
 * Java program to illustrate internal working HashMap
 */

import java.util.HashMap;

class Key {
	String key;
	Key(String key) {
		this.key = key;
	}

	@Override
	public int hashCode()
	{
		int hash = (int)key.charAt(0);
		System.out.println("hashCode for key: " + key + "=" + hash);
		return hash;
	}

	@Override
	public boolean equals(Object obj) {
		return key.equals(((Key)obj).key);
	}
}

// Driver class
public class Internal_Working_Of_HashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap map = new HashMap();

		map.put(new Key("Vishal"), 20);
		map.put(new Key("Sachin"), 30);
		map.put(new Key("Vaibhav"), 40);

		System.out.println();
		System.out.println("Value for Sachin: " + map.get(new Key("Sachin")));
		System.out.println("Value for Vaibhav: " + map.get(new Key("Vaibhav")));
	
	}
}
