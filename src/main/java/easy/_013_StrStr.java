package easy;

public class _013_StrStr {
    public int strStr(String source, String target) {
        // write your code here
        if (source == null || target == null) {
            return -1;
        }
        if (target.length() == 0) {
            return 0;
        }
        if (source.length() == 0) {
            return -1;
        }
        if (source.length() < target.length()) {
            return -1;
        }
        for (int i = 0; i < source.length() - target.length() + 1; i++) {
            boolean equal = false;
            for (int j = 0; j < target.length(); j++) {
                if (source.charAt(i + j) == target.charAt(j)) {
                    if (j == target.length() - 1) {
                        equal = true;
                    }
                } else {
                    break;
                }
            }
            if (equal) {
                return i;
            }
        }
        return -1;
    }
}
