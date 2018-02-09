package easy;

import java.util.HashMap;
import java.util.Map;

public class _082_SingleNumber {
    /*
     * @param A: An integer array
     * @return: An integer
     */
    public static int singleNumber(int[] A) {
        // write your code here
        if (A.length == 1) {
            return A[0];
        }
        Map<Integer, Integer> count = new HashMap<>();
        int single = 0;
        for (int i = 0; i < A.length; i++) {
            if (count.containsKey(A[i])) {
                count.put(A[i], count.get(A[i]) + 1);
            } else {
                count.put(A[i], 1);
            }
        }
        for (Integer key : count.keySet()) {
            if (count.get(key) == 1) {
                return key;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] a = {1, 1, 2, 2, 3, 4, 4};
        System.out.println(singleNumber(a));
    }
}
