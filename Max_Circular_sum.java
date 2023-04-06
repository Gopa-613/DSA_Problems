
public class Max_Circular_sum {
	
	    public static void main(String[] args) {
	        int[] arr = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1}; // Example array
	        int maxSum = findMaximumSum(arr);
	        System.out.println("Maximum sum: " + maxSum);
	    }

	    public static int findMaximumSum(int[] arr) {
	        int n = arr.length;
	        int totalSum = 0;
	        int currentSum = 0;

	        // Compute total_sum and current_sum
	        for (int i = 0; i < n; i++) {
	            totalSum += arr[i];
	            currentSum += i * arr[i];
	        }

	        int maxSum = currentSum;

	        // Compute current_sum for each rotation of the array and update max_sum
	        for (int i = 1; i < n; i++) {
	            currentSum = currentSum + totalSum - n * arr[n - i];
	            maxSum = Math.max(maxSum, currentSum);
	        }

	        return maxSum;
	    }
	}


