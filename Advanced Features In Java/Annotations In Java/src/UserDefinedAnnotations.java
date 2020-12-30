/*
 * Java program to demonstrate user defined annotations
 */
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

// user-defined annotation
@Documented
@Retention(RetentionPolicy.RUNTIME)

@ interface TestAnnotation
{
	String Developer() default "Rahul";
	String ExpiryDate();
} // will be retained at runtime

// Driver class that uses @TestAnnotation
public class UserDefinedAnnotations {

	@TestAnnotation(Developer="Rahul", Expirydate="01-10-2020")
	void fun1() {
		System.out.println("Test method1");
	}
	
	@TestAnnotation(Developer="Anil", Expirydate="01-10-2021")
	void fun2() {
		System.out.println("Test method2");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello");
	}
}
