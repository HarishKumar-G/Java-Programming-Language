/*
 * Java program to demonstrate the working of Interface
 */
import java.io.*;

/* A simple interface */

interface In1
{
	final int a = 10;
	void display();
}

public class Working_Of_Interface_Ex1 implements In1 {

	public void display()
	{
		System.out.println("Geek");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Working_Of_Interface_Ex1 t = new Working_Of_Interface_Ex1();
		t.display();
		System.out.println(a);
	}

}
