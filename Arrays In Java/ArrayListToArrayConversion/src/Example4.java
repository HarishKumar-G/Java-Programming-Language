import java.io.*;
import java.util.List;
import java.util.ArrayList;

public class Example4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);

		Integer[] arr = new Integer[al.size()];

		for(int i = 0; i < al.size(); i++)
			arr[i] = al.get(i);

		for(Integer x : arr)
			System.out.println(x + " ");
	}
}
