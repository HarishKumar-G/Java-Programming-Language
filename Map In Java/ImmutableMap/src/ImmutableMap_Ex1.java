/*
 * Below is the java program to create ImmutableMap
 */

import com.google.common.collect.ImmutableMap;
import java.util.HashMap;
import java.util.Map;

public class ImmutableMap_Ex1 {

	// function to create ImmutableMap from map
	public static <K, T> void iMap(Map<K, T> map) {

		// create immutableMap from Map using copyOf()
		ImmutableMap<K, T> immutableMap = ImmutableMap.copyOf(map);

		// print the immutableMap
		System.out.println(immutableMap);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "Geeks");
		map.put(2, "For");
		map.put(3, "Geeks");
		iMap(map);
	}
}
