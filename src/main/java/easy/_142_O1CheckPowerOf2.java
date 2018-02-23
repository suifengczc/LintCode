package easy;

public class _142_O1CheckPowerOf2 {
    /**
     * @param n: An integer
     * @return: True or false
     * 用 O(1) 时间检测整数 n 是否是 2 的幂次。
     */
    public static boolean checkPowerOf2(int n) {
        // write your code here
        return (n & (n - 1)) == 0 && (n > 0);//当n为2的N次方时，n和n-1相与为0
    }

    public static void main(String[] args) {
        System.out.println(checkPowerOf2(12));
    }
}
