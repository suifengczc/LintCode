package easy;

import java.awt.print.Printable;

public class _181_FlipBits {
    /**
     * @param a: An integer
     * @param b: An integer
     * @return: An integer
     * 如果要将整数A转换为B，需要改变多少个bit位？
     * 样例
     * 如把31转换为14，需要改变2个bit位。
     * (31)10=(11111)2
     * (14)10=(01110)2
     */
    public int bitSwapRequired(int a, int b) {
        // write your code here
        int data = a ^ b;
        String binaryStr = Integer.toBinaryString(data);
        int count = 0;
        for (int i = 0; i < binaryStr.length(); i++) {
            if (binaryStr.charAt(i) == 49) {
                count++;
            }
        }
        return count;
    }

    /**
     * @param a: An integer
     * @param b: An integer
     * @return: An integer
     * 如果要将整数A转换为B，需要改变多少个bit位？
     * 样例
     * 如把31转换为14，需要改变2个bit位。
     * (31)10=(11111)2
     * (14)10=(01110)2
     * 优化解法
     */
    public int bitSwapRequired_1(int a, int b) {
        int count = 0;
        for (int c = a ^ b; c != 0; c = c >>> 1) {
            count += c & 1;
        }
        return count;
    }

}
