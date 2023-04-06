
public class SmallestPositiveMissingNumber {
	
	    public static void main(String[] args) {
	        int[] arr = {8, 5, 6, 1, 9, 11, 2, 7, 4, 10}; // Example unsorted array
	        int missing = findSmallestMissingPositive(arr);
	        System.out.println("Smallest missing positive number: " + missing);
	    }

	    public static int findSmallestMissingPositive(int[] arr) {
	        int n = arr.length;

	        // Step 1: Ignore negative and zero elements, and elements greater than n
	        for (int i = 0; i < n; i++) {
	            if (arr[i] <= 0 || arr[i] > n) {
	                arr[i] = n + 1;
	            }
	        }

	        // Step 2: Place positive elements in their correct position
	        for (int i = 0; i < n; i++) {
	            int index = Math.abs(arr[i]) - 1;
	            if (index >= 0 && index < n && arr[index] > 0) {
	                arr[index] = -arr[index];
	            }
	        }

	        // Step 3: Return the index of the first element that does not match its index + 1
	        for (int i = 0; i < n; i++) {
	            if (arr[i] > 0) {
	                return i + 1;
	            }
	        }

	        return n + 1; // All elements are in their correct positions, so the smallest missing positive is n + 1
	    }
	}

	

