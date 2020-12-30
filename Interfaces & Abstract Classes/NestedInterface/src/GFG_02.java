/*
 * Java program to demonstrate an interface cannot have non-public member interface
 */

import java.util.*;

interface T
{
	protected interface Y
	{
		void show();
	}
}

class ToT implements T.Y
{
	public void show() {
		System.out.println("Show method of interface");
	}
}

public class GFG_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		T.Y obj;
		ToT t = new ToT();
		
		obj = t;
		obj.show();
	}

}
