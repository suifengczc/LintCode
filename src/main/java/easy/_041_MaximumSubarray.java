package easy;

public class _041_MaximumSubarray {
    /*
     * @param nums: A list of integers
     * @return: A integer indicate the sum of max subarray
     */
    //最大时间复杂度为O(n*n)
    public int maxSubArray(int[] nums) {
        // write your code here
        if (nums.length == 0) {
            return 0;
        }
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            for (int j = 0; j < nums.length - i; j++) {
                sum += nums[i + j];
                if (sum > max) {
                    max = sum;
                }
            }
        }
        return max;
    }
}
