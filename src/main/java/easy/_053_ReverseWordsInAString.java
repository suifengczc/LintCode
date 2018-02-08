package easy;

import com.sun.org.apache.bcel.internal.generic.RETURN;

public class _053_ReverseWordsInAString {
    /*
     * @param s: A string
     * @return: A string
     */
    public String reverseWords(String s) {
        // write your code here
        if (s == null || s.length() == 0 || !s.contains(" ")) {
            return s;
        }

        String[] strs = s.split(" ");
        if (strs.length == 0) {
            return s;
        }
        StringBuffer sb = new StringBuffer();

        for (int i = strs.length - 1; i >= 0; i--) {
            sb.append(strs[i] + " ");
        }

        return sb.substring(0, sb.length() - 1);
    }
}
