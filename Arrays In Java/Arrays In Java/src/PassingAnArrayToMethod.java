
public class PassingAnArrayToMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ary = {3, 1, 2, 5, 4};
		
		sum(ary);
	}
	
	public static void sum(int[] ary){
		int sum = 0;
		for(int i= 0; i < ary.length; i++){
			System.out.printf("ary[%d] : %d\n", i, ary[i]);
			sum += ary[i];
		}
		System.out.println("Sum of array values: " + sum);
	}
}
