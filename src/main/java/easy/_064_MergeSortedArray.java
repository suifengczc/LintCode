package easy;

import java.awt.print.Printable;

public class _064_MergeSortedArray {
    /*
     * @param A: sorted integer array A which has m elements, but size of A is m+n
     * @param m: An integer
     * @param B: sorted integer array B which has n elements
     * @param n: An integer
     * @return: nothing
     */
    public void mergeSortedArray(int[] A, int m, int[] B, int n) {
        // write your code here
        int indexA = m - 1;
        int indexB = n - 1;
        for (int i = m + n - 1; i >= 0; i--) {
            if (indexA < 0 || indexB < 0) {
                A[i] = indexA < 0 ? B[indexB--] : A[indexA--];
            } else {
                A[i] = A[indexA] > B[indexB] ? A[indexA--] : B[indexB--];
            }
        }
    }
}
