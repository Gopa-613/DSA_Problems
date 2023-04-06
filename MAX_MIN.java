import java.util.*;
public class MAX_MIN {

	public class MaxMinArray {
	    public static void main(String[] args) {
	        int[] arr = {1, 2, 3, 4, 5, 6, 7}; // Example sorted array
	        int[] result = maxMinArray(arr);
	        System.out.println(Arrays.toString(result));
	    }

	    public static int[] maxMinArray(int[] arr) {
	        int n = arr.length;
	        int[] result = new int[n];
	        int left = 0;
	        int right = n - 1;

	        for (int i = 0; i < n; i++) {
	            if (i % 2 == 0) {
	                result[i] = arr[right--];
	            } else {
	                result[i] = arr[left++];
	            }
	        }

	        return result;
	    }
	}

}
