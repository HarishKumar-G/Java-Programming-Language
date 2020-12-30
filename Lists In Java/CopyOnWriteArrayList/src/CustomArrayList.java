import java.util.ArrayList;

/*
 * Java program to illustrate customArrayList
 */

public class CustomArrayList {
	/*
	 * custom class which has data type class has defined the type of data ArrayList
	 * size of input 4
	 */
	int n = 4;
	
	// the custom datatype class
	class Data {
		int roll;
		String name;
		int marks;
		long phone;
		
		// constructor has type of data that is required
		Data(int roll, String name, int marks, long phone) {
			// initialize the input variable from main function to the global variable of the class
			this.roll = roll;
			this.name = name;
			this.marks = marks;
			this.phone = phone;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int roll[] = {1, 2, 3, 4};
		String name[] = {"Shubham", "Atul", "Ayush", "Rupesh"};
		int marks[]  = {100, 99, 93, 94};
		long phone[] = {8762357381L, 876235382L, 8762357383L, 8762357384L};
		
		// Create an object of the class
		CustomArrayList custom = new CustomArrayList();
		
		// and call the function to add the values to the array list
		custom.addValues(roll, name, marks, phone);
	}
	
	public void addValues(int roll[], String name[], int marks[], long phone[]) {
		// local custom arraylist of data type
		// data having (int, String, int, long) type
		// from the class
		
		ArrayList<Data> list = new ArrayList<>();
		for(int i=0; i < n; i++) {
			list.add(new Data(roll[i], name[i], marks[i], phone[i]));
		}
		
		// After adding values printing the values to test the custom arraylist
		printValues(list);
	}
	
	public void printValues(ArrayList<Data> list) {
		// list-the custom arraylist is sent from
		// previous function
		
		for (int i = 0; i < n; i++) {
			// the data received from arraylist is of Data type
			// which is custom(int, String, int, long) based on class Data
			
			Data data = list.get(i);
			// data variable of type data has fourprimitive datatypes
			// roll- int
			// name- String
			// marks- int
			//phone- long
			
			System.out.println(data.roll + " " + data.name + " " + data.marks + " " + data.phone);
		}
	}
}
