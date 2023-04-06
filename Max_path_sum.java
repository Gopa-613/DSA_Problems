
public class Max_path_sum {

	
	    public static void main(String[] args) {
	        int[] arr1 = {12, 13, 18, 20, 22, 26, 70}; // First array
	        int[] arr2 = {11, 15, 18, 19, 20, 26, 30, 31}; // Second array
	        int maxSum = findMaximumSum(arr1, arr2);
	        System.out.println("Maximum sum: " + maxSum);
	    }

	    public static int findMaximumSum(int[] arr1, int[] arr2) {
	        int n1 = arr1.length;
	        int n2 = arr2.length;
	        int i = 0;
	        int j = 0;
	        int maxSum = 0;
	        int sum1 = 0;
	        int sum2 = 0;

	        while (i < n1 && j < n2) {
	            if (arr1[i] < arr2[j]) {
	                sum1 += arr1[i];
	                i++;
	            } else if (arr1[i] > arr2[j]) {
	                sum2 += arr2[j];
	                j++;
	            } else {
	                maxSum += Math.max(sum1, sum2) + arr1[i];
	                i++;
	                j++;
	                sum1 = 0;
	                sum2 = 0;
	            }
	        }

	        while (i < n1) {
	            sum1 += arr1[i];
	            i++;
	        }

	        while (j < n2) {
	            sum2 += arr2[j];
	            j++;
	        }

	        maxSum += Math.max(sum1, sum2);

	        return maxSum;
	    }
	}


