package middle;

public class _005_kthLargestElement {
    /*
     * @param k : description of k
     * @param nums : array of nums
     * @return: description of return
     */
    public static int kthLargestElement(int k, int[] nums) {
        // write your code here
        //当nums数组过大时Time Limit Exceeded，耗时超出规定时间
        if (nums == null || k < 0) {
            return -1;
        }
        if (nums.length < k) {
            return -1;
        }
        int len = nums.length;
        for (int i = 0; i < len; i++) {
            for (int j = i+1; j < len; j++) {
                if (nums[i] < nums[j]) {
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }
        return nums[k - 1];
    }
    public int kthLargestElement_1(int k, int[] nums) {
        //TODO 使用快排思想，优化时间复杂度
        return -1;
    }

    public static void main(String[] args) {
        int[] a = new int[65535];
        for (int i = 0; i < a.length; i++) {
            a[i] = i;
        }
        System.out.println(kthLargestElement(50002, a));
    }
}
