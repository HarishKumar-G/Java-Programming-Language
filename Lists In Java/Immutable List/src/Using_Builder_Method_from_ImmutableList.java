/*
 * Java code illustrating of method to create a ImmutableList
 */

import java.util.*;
import com.google.common.collect.ImmutableList;

public class Using_Builder_Method_from_ImmutableList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// non-empty immutable set
		ImmutableList<String> iList = ImmutableList.<String>builder().add("Geeks", "For", "Geeks").build();
		
		// let's print the list
		System.out.println(iList);
	}
}
