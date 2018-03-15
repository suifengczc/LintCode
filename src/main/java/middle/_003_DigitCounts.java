package middle;

public class _003_DigitCounts {
    /*
     * @param : An integer
     * @param : An integer
     * @return: An integer denote the count of digit k in 1..n
     */
    public int digitCounts(int k, int n) {
        // write your code here
        // TODO 未完待续
        int count = 0;
        int quotient = n / 10;
        int remain = n % 10;
        if (quotient > k) {
            count = count + quotient + 10;
            if (remain >= k) {
                count = count + 1;
            }
        } else if (quotient == k) {
            count = count + quotient;
            if (remain >= k) {
                count = count + remain + 2;
            }
        } else {
            count = count + quotient;
            if (remain >= k) {
                count = count + 1;
            }
        }
        return count;
    }

    public int test(int k, int n) {
        int count = 0;
        int base = 1;
        while (n / base >= 1) {
            int curBit = n % (base * 10) / base;
            int higher = n / (base * 10);
            int lower = n % base;
            if (curBit < k) {
                count += higher * base;
            } else if (curBit == k) {
                count += higher * base + lower + 1;
            } else {
                count += (higher + 1) * base;
            }
            base *= 10;
        }
        return count;
    }

}
