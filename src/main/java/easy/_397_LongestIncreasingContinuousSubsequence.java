package easy;

public class _397_LongestIncreasingContinuousSubsequence {
    /**
     * @param A: An array of Integer
     * @return: an integer
     */
    public int longestIncreasingContinuousSubsequence(int[] A) {
        // write your code here
        if (A == null || A.length == 0) {
            return 0;
        }
        int len = A.length;
        int result = 1;
        int resultTemp = 1;
        for (int i = 1; i < len; i++) {
            if (A[i] > A[i - 1]) {
                resultTemp++;
            } else {
                resultTemp = 1;
            }
            result = Math.max(result, resultTemp);
        }
        resultTemp =1;
        for (int i = 1; i < len; i++) {
            if (A[i] < A[i - 1]) {
                resultTemp++;
            }else{
                resultTemp = 1;
            }
            result = Math.max(result, resultTemp);
        }
        return result;
    }
}
