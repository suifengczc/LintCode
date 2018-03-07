package easy;

import java.util.HashMap;

public class _211_StringPermutation {
    /**
     * @param A: a string
     * @param B: a string
     * @return: a boolean
     */
    public boolean Permutation(String A, String B) {
        // write your code here
        if (A.length() != B.length()) {
            return false;
        }
        int len = A.length();
        HashMap<Character, Integer> count = new HashMap<>();
        for (int i = 0; i < len; i++) {
            char a = A.charAt(i);
            char b = B.charAt(i);
            if (count.containsKey(a)) {
                count.put(a, count.get(a) + 1);
            } else {
                count.put(a, 1);
            }
            if (count.containsKey(b)) {
                count.put(b, count.get(b) - 1);
            } else {
                count.put(b, -1);
            }
        }
        for (Integer integer : count.values()) {
            if (integer != 0) {
                return false;
            }
        }
        return true;
    }
}
