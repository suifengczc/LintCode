package easy;

public class _055_CompareStrings {
    public boolean compareStrings(String A, String B) {
        // write your code here
        if ("".equals(A)) {
            if ("".equals(B)) {
                return true;
            }
            return false;
        }
        if ("".equals(B)) {
            return true;
        }
        char[] a = A.toCharArray();
        char[] b = B.toCharArray();
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (a[j] == b[i]) {
                    a[j] = '0';
                    break;
                }
                if (j >= a.length - 1) {
                    return false;
                }
            }
            if (i >= b.length - 1) {
                return true;
            }
        }
        return false;
    }

}
