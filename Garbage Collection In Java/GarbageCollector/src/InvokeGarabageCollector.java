/*
 * Java program to demonstrate requesting JVM to run Garbage Collector
 */

public class InvokeGarabageCollector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		InvokeGarabageCollector obj1 = new InvokeGarabageCollector();
		InvokeGarabageCollector obj2 = new InvokeGarabageCollector();
		
		// Nullifying the reference variable
		obj1 = null;
		
		// requesting JVM for running Garbage Collector
		System.gc();
		
		obj2 = null;
		Runtime.getRuntime().gc();
	}

	@Override
	// finalize method is called on object once
	// before GC collecting it
	protected void finalize() throws Throwable {
		System.out.println("Garbage Collector called");
		System.out.println("Object Garbage collected: " + this);
	}
}
