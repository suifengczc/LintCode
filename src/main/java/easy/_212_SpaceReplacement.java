package easy;

public class _212_SpaceReplacement {
    /**
     * @param string: An array of Char
     * @param length: The true length of the string
     * @return: The true length of new string
     */
    public int replaceBlank(String string, int length) {
        // write your code here
        // TODO lintcode 编译报错，原因未知
        if (string == null || string.length() == 0) {
            return 0;
        }
        char[] strs = new char[length + (string.length() - length) * 3];
        int index = 0;
        for (int i = 0; i < strs.length; i++) {
            if (string.charAt(i) == ' ') {
                strs[index++] = '%';
                strs[index++] = '2';
                strs[index++] = '0';
            }else{
                strs[index++] = string.charAt(i);
            }
        }
        return index;
    }
    public int replaceBlank(char[] string, int length) {
        // write your code here
        if (string == null || string.length == 0) {
            return 0;
        }
        char[] strs = new char[length + (string.length - length) * 3];
        int index = 0;
        for (int i = 0; i < strs.length; i++) {
            if (string[i] == ' ') {
                strs[index++] = '%';
                strs[index++] = '2';
                strs[index++] = '0';
            }else{
                strs[index++] = string[i];
            }
        }
        return index;
    }
}
