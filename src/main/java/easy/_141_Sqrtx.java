package easy;

public class _141_Sqrtx {
    /**
     * @param x: An integer
     * @return: The sqrt of x
     */
    public int sqrt(int x) {
        // write your code here
        if (x == 1) {
            return 1;
        }
        long start = 1L;
        long end = x / 2;
        long mid = (start + end) / 2;
        while (start <= end) {
            if (mid * mid < x) {
                start = mid + 1;
            } else if (mid * mid > x) {
                end = mid - 1;
            } else {
                return (int) mid;
            }
            mid = (start + end) / 2;
        }
        return (int)end;
    }
}
