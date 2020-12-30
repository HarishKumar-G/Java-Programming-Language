
public class recursiveBinarySearch {

	int binarySearch(int ary[], int l, int r, int x)
	{
		if (r >= 1)
		{
			int mid = l + (r - l)/2;
			
			if (ary[mid] == x)
				return mid;
			
			if (ary[mid] > x)
				return binarySearch(ary, l, mid -1 , x);
			
			return binarySearch(ary, mid + 1, r, x);
		}
		
		return -1;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		recursiveBinarySearch obj = new recursiveBinarySearch();
		int ary[] = { 2, 3, 4, 10, 40 };
		int n = ary.length;
		int x = 10;
		int result = obj.binarySearch(ary, 0, n-1, x);
		if (result == -1)
			System.out.println("Element not present");
		else
			System.out.println("Element found at index: " + result);
	}
}
