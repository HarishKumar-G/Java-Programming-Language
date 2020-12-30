// Java program to demonstrate need of try catch clause

public class NeedOfTryCatchClause {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = new int[4];
		
		// this statement causes an exception 
		int i = arr[4];
		// the following statement will never execute, that's why we need try catch clause
		System.out.println("Hi, I want to execute");
	}
}
