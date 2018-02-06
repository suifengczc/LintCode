package easy;

public class _457_ClassicalBinarySearch {
    public int findPosition(int[] nums, int target) {
        // Write your code here
        int low = 0;
        int high = nums.length - 1;
        while (low <= high) {
            int middle = (low + high) / 2;
            if (nums[middle] > target) {
                high = middle - 1;
            } else if (nums[middle] == target) {
                return middle;
            } else if (nums[middle] < target) {
                low = middle + 1;
            }
        }
        return -1;
    }
}
