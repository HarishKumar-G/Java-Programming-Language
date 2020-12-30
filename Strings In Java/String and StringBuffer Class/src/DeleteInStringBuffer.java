
public class DeleteInStringBuffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBuffer s = new StringBuffer("GeeksforGeeks");
		s.delete(0, 5);
		System.out.println(s);
		s.deleteCharAt(7);
		System.out.println(s);
	}
}
