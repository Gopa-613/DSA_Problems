
public class Array_Index {

	
	    public static void main(String[] args) {
	        int[] arr = {33, 9, 10, 3, 2, 60, 30, 33, 1}; // Example array
	        int maxDistance = findMaximumDistance(arr);
	        System.out.println("Maximum distance: " + maxDistance);
	    }

	    public static int findMaximumDistance(int[] arr) {
	        int n = arr.length;
	        int[] leftMin = new int[n];
	        int[] rightMax = new int[n];

	        // Populate leftMin array
	        leftMin[0] = arr[0];
	        for (int i = 1; i < n; i++) {
	            leftMin[i] = Math.min(leftMin[i-1], arr[i]);
	        }

	        // Populate rightMax array
	        rightMax[n-1] = arr[n-1];
	        for (int i = n-2; i >= 0; i--) {
	            rightMax[i] = Math.max(rightMax[i+1], arr[i]);
	        }

	        int i = 0;
	        int j = 0;
	        int maxDistance = -1;

	        // Traverse both arrays and compare values
	        while (i < n && j < n) {
	            if (leftMin[i] <= rightMax[j]) {
	                maxDistance = Math.max(maxDistance, j - i);
	                j++;
	            } else {
	                i++;
	            }
	        }

	        return maxDistance;
	    }
	}


