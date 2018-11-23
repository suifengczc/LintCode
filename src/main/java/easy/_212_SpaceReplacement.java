package easy;

/**
 * 212. 空格替换
 * 设计一种方法，将一个字符串中的所有空格替换成 %20 。
 * 你可以假设该字符串有足够的空间来加入新的字符，
 * 且你得到的是“真实的”字符长度。
 * <p>
 * 你的程序还需要返回被替换后的字符串的长度。
 * <p>
 * 样例
 * 对于字符串"Mr John Smith", 长度为 13
 * <p>
 * 替换空格之后，参数中的字符串需要变为"Mr%20John%20Smith"，并且把新长度 17 作为结果返回。
 * <p>
 * 挑战
 * 在原字符串(字符数组)中完成替换，不适用额外空间
 * <p>
 * 注意事项
 * 如果使用 Java 或 Python, 程序中请用字符数组表示字符串。
 */
public class _212_SpaceReplacement {
    /**
     * 不使用新的数组，在原数组中操作
     *
     * 思路：
     * 1.遍历字符数组得到所有空格数量，得到新数组长度
     * 2.已新数组长度为基准，将原来数组的各个元素从后往前逐个向后移动
     *
     * @param string: An array of Char
     * @param length: The true length of the string
     * @return: The true length of new string
     */
    public int replaceBlank(char[] string, int length) {
        // write your code here
        if (length <= 0) {
            return 0;
        }
        int count = 0;
        for (int i = 0; i < length; i++) {
            if (' ' == string[i]) {
                count++;
            }
        }
        int len = length + count * 2;
        int idx = len - 1;
        for (int i = length - 1; i >= 0; i--) {
            if (' ' == string[i]) {
                string[idx--] = '0';
                string[idx--] = '2';
                string[idx--] = '%';
            } else {
                string[idx--] = string[i];
            }
        }
        return len;
    }
}
