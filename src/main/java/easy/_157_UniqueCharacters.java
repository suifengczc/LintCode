package easy;

import java.util.HashMap;
import java.util.Map;

public class _157_UniqueCharacters {
    /*
     * @param str: A string
     * @return: a boolean
     */
    public boolean isUnique(String str) {
        // write your code here
        Map<Character, Integer> count = new HashMap<>();
        for (char c : str.toCharArray()) {
            if (count.containsKey(c)) {
                return false;
            } else {
                count.put(c, 1);
            }
        }
        return true;
    }

    /*
     * @param str: A string
     * @return: a boolean
     * solution_2
     */
    public boolean isUnique_1(String str) {
        if (str == null || str.length() == 0) {
            return true;
        }
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    return false;
                }
            }
        }
        return true;
    }
}
