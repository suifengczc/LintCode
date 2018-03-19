package middle;

public class _031_PartitionArray {
    /**
     * @param nums: The integer array you should partition
     * @param k:    An integer
     * @return: The index after partition
     */
    public static int partitionArray(int[] nums, int k) {
        // write your code here
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int indexSmall = 0;
        int indexBig = nums.length - 1;
        while (indexSmall <= indexBig) {
            while (indexSmall <= indexBig && nums[indexSmall] < k) {
                indexSmall++;
            }
            while (indexSmall <= indexBig && nums[indexBig] >= k) {
                indexBig--;
            }
            if (indexSmall <= indexBig) {
                int temp = nums[indexSmall];
                nums[indexSmall] = nums[indexBig];
                nums[indexBig] = temp;
                indexSmall++;
                indexBig--;
            }
        }
        return indexSmall;
    }

    public static void main(String[] args) {
        int[] a = {6, 7, 8, 7, 6};
        System.out.println(partitionArray(a, 5));
    }
}
