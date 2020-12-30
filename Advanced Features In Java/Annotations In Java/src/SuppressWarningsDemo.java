/*
 * Java program to demonstrate "@SuppressWarnings" annotation
 */

class DeprecatedTest
{
	@Deprecated
	public void Display()
	{
		System.out.println("DeprecatedTest display()");
	}
}

public class SuppressWarningsDemo {

	// if we comment below annotation, program generates warniing
	@SuppressWarnings({"checked", "deprecation"})
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DeprecatedTest d1 = new DeprecatedTest();
		d1.Display();
	}
}
