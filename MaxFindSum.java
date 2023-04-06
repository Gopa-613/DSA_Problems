
public class MaxFindSum {
	
	    public static int findMaxSum(int[] nums) {
	        int n = nums.length;
	        int[] dp = new int[n];
	        dp[0] = nums[0];
	        dp[1] = Math.max(nums[0], nums[1]);
	        for (int i = 2; i < n; i++) {
	            dp[i] = Math.max(dp[i-1], dp[i-2] + nums[i]);
	        }
	        return dp[n-1];
	    }

	    public static void main(String[] args) {
	        int[] nums = {5, 1, 1, 5};
	        int maxSum = findMaxSum(nums);
	        System.out.println("Maximum sum: " + maxSum);
	    }
	}

	
