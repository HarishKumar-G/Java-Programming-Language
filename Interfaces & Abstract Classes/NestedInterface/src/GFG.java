/*
 * Java program to demonstrate working of interface inside a class
 */

import java.util.*;

class Test
{
	interface Yes
	{
		void show();
	}
}

class Testing implements Test.Yes {
	public void show() {
		System.out.println("Show method of interface");
	}
}

public class GFG {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Test.Yes obj;
		Testing t = new Testing();
		
		obj = t;
		obj.show();
	}

}
