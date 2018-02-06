package easy;

public class _366_Fibonacci {
    public int fibonacci(int n) {
        // write your code here
        int s1 = 0;
        int s2 = 1;
        int sn = 0;
        if (n == 1) {
            return 0;
        }
        if (n == 2) {
            return 1;
        }
        if (n > 2) {
            for (int i = 0; i < n - 2; i++) {
                sn = s1 + s2;
                s1 = s2;
                s2 = sn;
            }
        }
        return sn;
    }
}
