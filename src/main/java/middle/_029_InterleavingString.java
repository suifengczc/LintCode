package middle;

public class _029_InterleavingString {
    /**
     * @param s1: A string
     * @param s2: A string
     * @param s3: A string
     * @return: Determine whether s3 is formed by interleaving of s1 and s2
     */
    public boolean isInterleave(String s1, String s2, String s3) {
        // write your code here
        if ((s3 == null && (s1 != null || s2 != null)) || (s3 != null && s2 == null && s1 == null)) {
            return false;
        }
        int len1 = s1.length();
        int len2 = s2.length();
        int len3 = s3.length();
        if (len1 + len2 != len3) {
            return false;
        }
        boolean[][] dp = new boolean[len1 + 1][len2 + 1];
        dp[0][0] = true;
        for (int i = 1; i < len1 + 1; i++) {
            if (s3.charAt(i - 1) == s1.charAt(i - 1) && dp[i - 1][0]) {
                dp[i][0] = true;
            }
        }
        for (int j = 1; j < len2 + 1; j++) {
            if (s3.charAt(j - 1) == s2.charAt(j - 1) && dp[0][j - 1]) {
                dp[0][j] = true;
            }
        }
        for (int i = 1; i < len1 + 1; i++) {
            for (int j = 1; j < len2 + 1; j++) {
                if ((s3.charAt(i + j - 1) == s1.charAt(i - 1) && dp[i - 1][j]) || (s3.charAt(i + j - 1) == s2.charAt(j - 1) && dp[i][j - 1])) {
                    dp[i][j] = true;
                }
            }
        }
        return dp[len1][len2];
    }
}
