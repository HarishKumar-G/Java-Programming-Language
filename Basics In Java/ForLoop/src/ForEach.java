
public class ForEach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int marks[] = {125, 137, 144, 167, 117};
		int highestMarks = maximum(marks);
		System.out.println("The highest score is: " + highestMarks);
	}
	
	public static int maximum(int[] nums){
		int maxSoFar = nums[0];
		
		for (int num : nums){
			if (num > maxSoFar)
				maxSoFar = num;
		}
		return maxSoFar;
	}
}
