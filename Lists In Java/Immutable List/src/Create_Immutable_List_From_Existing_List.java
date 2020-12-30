/*
 * Java code illustrating of() method to create a ImmuatableList
 */

import java.util.*;
import com.google.common.collect.ImmutableList;

public class Create_Immutable_List_From_Existing_List {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// non-empty immuatble list
		List<String> list = List.of("Geeks", "for", "Geeks");
		ImmutableList<String> iList = ImmutableList.<String>builder().addAll(list).build();
		
		// let's print the list
		System.out.println(iList);
	}
}
