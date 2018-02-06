package easy;

public class _006_MergeSortedArray {
    public int[] mergeSortedArray(int[] A, int[] B) {
        // write your code here
        int[] c = new int[A.length + B.length];
        int indexA = 0;
        int indexB = 0;
        int indexC = 0;
        while (indexA < A.length && indexB < B.length) {
            if (A[indexA] < B[indexB]) {
                c[indexC++] = A[indexA++];
            } else {
                c[indexC++] = B[indexB++];
            }
        }
        while (indexA < A.length) {
            c[indexC++] = A[indexA++];
        }
        while (indexB < B.length) {
            c[indexC++] = B[indexB++];
        }
        return c;
    }
}
