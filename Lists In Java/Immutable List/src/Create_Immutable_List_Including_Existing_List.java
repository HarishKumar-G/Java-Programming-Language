/*
 * Java code illustrating of method to create a ImmutableList
 */

import java.util.*;
import com.google.common.collect.ImmutableList;

public class Create_Immutable_List_Including_Existing_List {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// non-empty Immutable set
		List<String> list.of("Geeks", "For", "Geeks");
		ImmutableList<String> iList = ImmuatableList.<String>builder().addAll(list).add("computer", "Portal",).build();
		
		// Let's print the set
		System.out.println(iList);
	}
}
