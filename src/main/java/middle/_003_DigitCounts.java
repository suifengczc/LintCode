package middle;

/**
 * 3. 统计数字
 * 计算数字k在0到n中的出现的次数，k可能是0~9的一个值
 *
 * 样例
 * 例如n=12，k=1，在 [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12]，
 * 我们发现1出现了5次 (1, 10, 11, 12)
 */
public class _003_DigitCounts {
    /**
     * 思路：
     *
     * @param k: An integer
     * @param n: An integer
     * @return: An integer denote the count of digit k in 1..n
     */
    public int digitCounts(int k, int n) {
        // write your code here
        if (n < 10) {
            return 1;
        }
        return 1;
    }
}
