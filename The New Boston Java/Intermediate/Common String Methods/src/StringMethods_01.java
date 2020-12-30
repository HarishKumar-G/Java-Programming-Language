
public class StringMethods_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] words = {"funk", "chunk", "furry", "baconator"};
		
		// StartsWith
		for(String w : words) {
			if(w.startsWith("fu"))
				System.out.println(w + " Starts with fu");
		}
		
		for(String w : words){
			if(w.endsWith("nk"))
				System.out.println(w + " Ends with nk");
		}
	}
}
