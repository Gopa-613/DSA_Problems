
public class BIN_rec {
	
	    public static int binarySearch(int[] nums, int target) {
	        return binarySearch(nums, target, 0, nums.length - 1);
	    }

	    private static int binarySearch(int[] nums, int target, int low, int high) {
	        if (low > high) {
	            return -1;
	        }
	        int mid = low + (high - low) / 2;
	        if (nums[mid] == target) {
	            return mid;
	        } else if (nums[mid] < target) {
	            return binarySearch(nums, target, mid + 1, high);
	        } else {
	            return binarySearch(nums, target, low, mid - 1);
	        }
	    }

	    public static void main(String[] args) {
	        int[] nums = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
	        int target = 7;
	        int index = binarySearch(nums, target);
	        if (index == -1) {
	            System.out.println("Element not found");
	        } else {
	            System.out.println("Element found at index " + index);
	        }
	    }
	}

	

