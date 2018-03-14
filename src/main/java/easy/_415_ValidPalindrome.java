package easy;

public class _415_ValidPalindrome {
    /**
     * @param s: A string
     * @return: Whether the string is a valid palindrome
     */
    public static boolean isPalindrome(String s) {
        // write your code here
        if (s == null || s.length() == 0) {
            return true;
        }
        int len = s.length();
        s = s.toLowerCase();
        char[] cArr = new char[len];
        int cIndex = 0;
        for (int i = 0; i < len; i++) {
            if (Character.isLetter(s.charAt(i)) || Character.isDigit(s.charAt(i))) {
                cArr[cIndex++] = s.charAt(i);
            }
        }
        if (cIndex <= 0) {
            return true;
        }
        for (int i = 0; i < (cIndex - 1) / 2 + 1; i++) {
            if (cArr[i] != cArr[cIndex - 1 - i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String a = "aA";
        System.out.println(isPalindrome(a));
    }
}
