/*
 * Java program to illustrate Automatic Resource Management in Java with multiple resource
 */

public class Resource_WithMultipleResources {

	public static void main(String[] args) {
		// note the order of opening the resources
		try (Demo d = new Demo(); Demo1 d1 = new Demo1()) {
			int x = 10/0;
			d.show();
			d1.show1();
		} catch(ArithmeticException e) {
			System.out.println(e);
		}
	}
}


class Demo implements AutoCloseable {
	void show()
	{
		System.out.println("Inside show()");
	}
	public void close() {
		System.out.println("Close from demo");
	}
}


class Demo1 implements AutoCloseable
{
	void show1()
	{
		System.out.println("inside show1()");
	}
	public void close()
	{
		System.out.println("close from demo1");
	}
}