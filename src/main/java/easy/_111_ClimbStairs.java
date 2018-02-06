package easy;

public class _111_ClimbStairs {
    public int climbStairs(int n) {
        // write your code here
        int s1 = 1;
        int s2 = 2;
        int sn = 0;
        if (n == 1 || n == 0) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }
        if (n > 2) {
            for (int i = 2; i < n; i++) {
                sn = s1 + s2;
                s1 = s2;
                s2 = sn;
            }
        }
        return sn;
    }
}
