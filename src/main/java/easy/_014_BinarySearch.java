package easy;

public class _014_BinarySearch {

    public static int binarySearch(int[] nums, int target){
        int start = 0;
        int end = nums.length - 1;
        int mid;
        while (start <= end) {
            mid = start + ((end - start) / 2);
            if (target <= nums[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return (start <= nums.length) && (nums[start] == target) ? start : -1;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 2, 2, 2, 6, 8, 13, 17, 18};
        System.out.println(binarySearch(nums, 2));
    }
}
