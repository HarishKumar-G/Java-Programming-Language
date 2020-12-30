/*
 * Java program to demonstrate working of interface inside another interface
 */

import java.util.*;

interface Tst {
	interface yes {
		void show();
	}
}

class ToTst implements Tst.yes
{
	public void show() {
		System.out.println("show method of interface");
	}
}

public class Interface_In_Another_Interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tst.yes obj;
		ToTst t = new ToTst();
		obj = t;
		obj.show();
	}

}
