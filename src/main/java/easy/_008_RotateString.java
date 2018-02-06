package easy;

public class _008_RotateString {
    public void rotateString(char[] str, int offset) {
        if (str.length > 0 && str != null) {
            offset = offset % str.length;
            char[] a = str.clone();
            int index = 0;
            for (int i = str.length - offset; i < str.length; i++) {
                str[index++] = a[i];
            }
            for (int i = 0; i < str.length - offset; i++) {
                str[index++] = a[i];
            }
        }
    }
}
