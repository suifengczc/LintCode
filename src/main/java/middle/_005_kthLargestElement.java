package middle;

/**
 * 描述
 * 在数组中找到第k大的元素
 * <p>
 * 你可以交换数组中的元素的位置
 * <p>
 * 您在真实的面试中是否遇到过这个题？
 * 样例
 * 给出数组 [9,3,2,4,8]，第三大的元素是 4
 * <p>
 * 给出数组 [1,2,3,4,5]，第一大的元素是 5，第二大的元素是 4，第三大的元素是 3，以此类推
 * <p>
 * 挑战
 * 要求时间复杂度为O(n)，空间复杂度为O(1)
 */

public class _005_kthLargestElement {
    /*
     * @param n : description of n
     * @param nums : array of nums
     * @return: description of return
     */
//    public static int kthLargestElement(int k, int[] nums) {
//        // write your code here
//        //当nums数组过大时Time Limit Exceeded，耗时超出规定时间
//        if (nums == null || k < 0) {
//            return -1;
//        }
//        if (nums.length < k) {
//            return -1;
//        }
//        int len = nums.length;
//        for (int i = 0; i < len; i++) {
//            for (int j = i+1; j < len; j++) {
//                if (nums[i] < nums[j]) {
//                    int temp = nums[i];
//                    nums[i] = nums[j];
//                    nums[j] = temp;
//                }
//            }
//        }
//        return nums[k - 1];
//    }
//
    public static int kthLargestElement(int n, int[] nums) {
        quickSort(0, nums.length - 1, nums);
        return nums[n-1];
    }

    public static void quickSort(int i, int j, int[] data) {
        //TODO 数组过长时栈溢出
        if (i < j) {
            int l = i;
            int r = j;
            int pivot = data[i];
            while (l != r) {
                while (l < r && data[r] <= pivot) {
                    r--;
                }
                while (l < r && data[l] >= pivot) {
                    l++;
                }
                if (l < r) {
                    int temp = data[l];
                    data[l] = data[r];
                    data[r] = temp;
                }
            }
            data[i] = data[l];
            data[l] = pivot;
            quickSort(i, l - 1, data);
            quickSort(l + 1, j, data);
        }
    }


    public static void main(String[] args) {
        int[] a = new int[19000];
        for (int i = 0; i < a.length; i++) {
            a[i] = i;
        }
        long last = System.currentTimeMillis();
        int[] data = {9,1,3,7,6,4,8,2,5};
//        int[] data = {1,3,8,7};
//        for (int i = 0; i < data.length; i++) {
//            System.out.print(data[i]+"-");
//        }
//        System.out.println();
//        quickSort(0, data.length - 1, data);
//        for (int i = 0; i < data.length; i++) {
//            System.out.print(data[i]+"-");
//        }
        System.out.println(kthLargestElement(1, data));
        System.out.println("cost = " + (System.currentTimeMillis() - last));
    }
}
