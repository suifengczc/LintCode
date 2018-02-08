package easy;

public class _060_SearchInsertPosition {
    /*
     * @param A: an integer sorted array
     * @param target: an integer to be inserted
     * @return: An integer
     */
    public int searchInsert(int[] A, int target) {
        // write your code here
        if (A.length == 0) {
            return 0;
        }
        if (A[A.length - 1] < target) {
            return A.length;
        }
        for (int i = 0; i < A.length; i++) {
            if (A[i] >= target) {
                return i;
            }
        }
        return 0;
    }
}
