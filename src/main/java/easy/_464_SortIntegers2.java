package easy;

/**
 * 464. 整数排序 II
 * 给一组整数，按照升序排序。使用归并排序，快速排序，堆排序或者任何其他 O(n log n) 的排序算法。
 * <p>
 * 样例
 * 例1：
 * <p>
 * 输入：[3,2,1,4,5]，
 * 输出：[1,2,3,4,5]。
 * 例2：
 * <p>
 * 输入：[2,3,1]，
 * 输出：[1,2,3]。
 */
public class _464_SortIntegers2 {
    /**
     * @param A: an integer array
     * @return: nothing
     */
    public void sortIntegers2(int[] A) {
        // write your code here
        quickSort(0, A.length - 1, A);
    }

    public void quickSort(int i, int j, int[] data) {
        if (i < j) {
            int l = i;
            int r = j;
            int pivot = data[i];
            while (l != r) {
                while (l < r && data[r] >= pivot) {
                    r--;
                }
                while (l < r && data[l] <= pivot) {
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
}
