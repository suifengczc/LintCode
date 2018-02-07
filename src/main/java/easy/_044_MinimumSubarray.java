package easy;

import java.util.List;

public class _044_MinimumSubarray {
    /*
     * @param nums: a list of integers
     * @return: A integer indicate the sum of minimum subarray
     */
    public int minSubArray(List<Integer> nums) {
        // write your code here
        if (nums.size() == 0) {
            return 0;
        }
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < nums.size(); i++) {
            int sum = 0;
            for (int j = 0; j < nums.size() - i; j++) {
                sum += nums.get(i + j);
                if (sum < min) {
                    min = sum;
                }
            }
        }
        return min;
    }
}
