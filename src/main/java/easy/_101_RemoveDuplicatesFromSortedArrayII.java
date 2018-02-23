package easy;

public class _101_RemoveDuplicatesFromSortedArrayII {
    /**
     * @param nums: a array of integers
     * @return : return an integer
     * 允许重复两次
     */
    public static int removeDuplicates(int[] nums) {
        // write your code here
        if (nums.length == 0) {
            return 0;
        }
        if (nums.length <= 2) {
            return nums.length;
        }
        int currIndex = 0;
        int sameCount = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[currIndex]) {
                if (sameCount < 2) {
                    nums[++currIndex] = nums[i];
                    sameCount++;
                }
            } else {
                nums[++currIndex] = nums[i];
                sameCount = 1;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            System.out.print("\"" + nums[i] + "\", ");
        }
        return currIndex + 1;
    }

    public static void main(String[] args) {
//        int[] a = {-1, -1, -1, 0, 1, 2, 2, 2, 2, 3, 4, 5};
//        int[] a = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 1};
        int[] a = {-8, 0, 1, 2, 3};
        System.out.println("\n" + removeDuplicates(a));
    }
}