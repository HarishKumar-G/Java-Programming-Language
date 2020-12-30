/*
 * Java program to demonstrate protected specifier for nested interface
 */

import java.util.*;

class Test1
{
	protected interface Yes
	{
		void show();
	}
}

class ToTest implements Test1.Yes {
	public void show(){
		System.out.println("Show method of interface");
	}
}


public class GFG_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test1.Yes obj;
		ToTest t = new ToTest();
		obj = t;
		obj.show();
	}
}
