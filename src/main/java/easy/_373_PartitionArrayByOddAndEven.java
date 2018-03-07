package easy;

public class _373_PartitionArrayByOddAndEven {
    /*
     * @param nums: an array of integers
     * @return: nothing
     */
    public void partitionArray(int[] nums) {
        // write your code here
        if (nums == null) {
            return;
        }
        int oddCount = 0;
        // TODO undone
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 != 0) {
                oddCount++;
            }
        }
    }
}
