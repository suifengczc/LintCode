package easy;

import java.awt.print.Printable;

public class _080_Median {
    /*
     * @param : A list of integers
     * @return: An integer denotes the middle number of the array
     */
    public static int median(int[] nums) {
        // write your code here
        if (nums.length == 1) {
            return nums[0];
        }
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] > nums[j]) {
                    int temp = nums[j];
                    nums[j] = nums[i];
                    nums[i] = temp;
                }
            }
        }
        return nums[nums.length % 2 == 0 ? nums.length / 2 - 1 : nums.length / 2];
    }

    public static void main(String[] args) {
        int[] a = {5, 6, 7, 2, 4, 3, 8, 0};
        median(a);
    }
}
