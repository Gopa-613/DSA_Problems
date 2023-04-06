
public class MAX_SUM {

	public static int maxSubarraySum(int[] arr) {
	    int maxSoFar = arr[0];
	    int maxEndingHere = arr[0];
	    for (int i = 1; i < arr.length; i++) {
	        maxEndingHere = Math.max(arr[i], maxEndingHere + arr[i]);
	        maxSoFar = Math.max(maxSoFar, maxEndingHere);
	    }
	    return maxSoFar;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[] = {1,-2,3,4,-4,6,-4,3,2};
System.out.println(maxSubarraySum(arr));
	}
}
