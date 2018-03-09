package easy;

public class _373_PartitionArrayByOddAndEven {
    /*
     * @param nums: an array of integers
     * @return: nothing
     */
    public static void partitionArray(int[] nums) {
        // write your code here
        // TODO 还没想法
        if (nums == null) {
            return;
        }
        int oddCount = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 != 0) {
                oddCount++;
            }
        }
//        int start = 0, end = nums.length - 1;
//        while (start < end) {
//            while (start < end && nums[start] % 2 == 1) {
//                start++;
//            }
//            while (start < end && nums[end] % 2 == 0) {
//                end--;
//            }
//            if (start < end) {
//                int temp = nums[start];
//                nums[start] = nums[end];
//                nums[end] = temp;
//                start++;
//                end--;
//            }
//        }
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 4, 3, 5, 6};
        partitionArray(a);
    }
}
