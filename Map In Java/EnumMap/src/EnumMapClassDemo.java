/*
 * Java program to illustrate working of  EnumMap and its functions
 */
import java.util.EnumMap;

public class EnumMapClassDemo {
	
	public enum GFG
	{
		CODE, CONTRIBUTE, QUIZ, MCQ;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Java EnumMap: Creating EnumMap in Java with key as Enum type state
		EnumMap<GFG, String> gfgMap = new EnumMap<GFG, String>(GFG.class);
		
		// Java EnumMap example2: Putting values inside EnumMap in Java
		// Inserting Enum Keys different from their natural order
		gfgMap.put(GFG.CODE, "Start coding with GFG");
		gfgMap.put(GFG.CONTRIBUTE, "Contribute for others");
		gfgMap.put(GFG.QUIZ, "Practice Quizes");
		gfgMap.put(GFG.MCQ, "Test speed with MCQs");
		
		// Printing size of enumMap
		System.out.println("Size of enum map: " + gfgMap.size());
		
		// Printing Java enum map
		// Print enum map in natural order of enum keys (order in which theye are declared)
		System.out.println("EnumMap: " + gfgMap);
		
		// Retrieving value from enumMap in Java
		System.out.println("Key: " + GFG.CODE + ", Value: " + gfgMap.get(GFG.CODE));
		
		// Checking if EnumMap contains a particular key
		System.out.println("Does enum Map has " + GFG.CONTRIBUTE + "? :" + gfgMap.containsKey(GFG.CONTRIBUTE));
		
		// checking if enumMap contains a particular value
		System.out.println("Does enum Map has " + GFG.QUIZ + "? :" + gfgMap.containsValue("Practice Quizes"));
		System.out.println("Does GFG has: " + GFG.QUIZ + "? :" + gfgMap.containsValue(null));
		
	}

}
