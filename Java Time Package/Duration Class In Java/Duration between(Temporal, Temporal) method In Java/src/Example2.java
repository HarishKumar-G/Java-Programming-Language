import java.time.Duration;

/*
 * Java code to illustrate between() method
 */

public class Example2 {

	public static void main(String[] args) {
		
		// Duration using between() method
		Duration duration = Duration.between(java.time.LocalTime.NOON, java.time.LocalTime.MAX);
		System.out.println(duration.getSeconds());
	}

}
