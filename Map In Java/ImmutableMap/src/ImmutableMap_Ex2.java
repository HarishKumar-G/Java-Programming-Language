/*
 * Below is the program to create ImmuatableMap
 */
import com.google.common.collect.ImmutableMap;
import java.util.HashMap;
import java.util.Map;

public class ImmutableMap_Ex2 {

	// Function to create ImmutableMap
	public static createImmutableMap()
	{
		// Create ImmutableMap using of()
		ImmutableMap<Integer, String> immutableMap = ImmutableMap.of(1, "Geeks",
																	 2, "for",
																	 3, "Geeks");
		
		// Print the Immutable Map
		System.out.println(immutableMap);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		createImmutableMap();
	}
}
