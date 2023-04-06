import java.util.*;

	public class PERM {
	    public static void permute(int[] nums) {
	        permute(nums, 0);
	    }

	    private static void permute(int[] nums, int start) {
	        if (start == nums.length) {
	            System.out.println(Arrays.toString(nums));
	        } else {
	            for (int i = start; i < nums.length; i++) {
	                swap(nums, start, i);
	                permute(nums, start + 1);
	                swap(nums, start, i);
	            }
	        }
	    }

	    private static void swap(int[] nums, int i, int j) {
	        int temp = nums[i];
	        nums[i] = nums[j];
	        nums[j] = temp;
	    }

	    public static void main(String[] args) {
	        int[] nums = {1, 2, 3};
	        permute(nums);
	    }
	
	}



