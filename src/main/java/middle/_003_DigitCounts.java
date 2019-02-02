package middle;

/**
 * 3. 统计数字
 * 计算数字k在0到n中的出现的次数，k可能是0~9的一个值
 * <p>
 * 样例
 * 例如n=12，k=1，在 [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12]，
 * 我们发现1出现了5次 (1, 10, 11, 12)
 */
public class _003_DigitCounts {
    /**
     * 思路：
     * 在0-9中k出现的次数都为1次
     * 在10-19中当k==1时为1+10次，当k!=1时为1次
     * 在20-29中当k==2时为1+10次，当k!=2时为1次
     * 以此类推
     * 在100-199中先去掉开头的1，则是00-99的累计值，当k==1时，为累计加100；当k!=1时，为累计值
     * 在200-299中，当k==2时为累计值加100；当k!=2时，为累计值
     * 以此类推
     * 在1000-1999中，当k==1时，为000-999的累计值+1000；当k!=1时，为累计值
     * 在2000-2999中，当k==2时，为000-999的累计值+1000；当k!=2时，为累计值
     * <p>
     * 规律：
     * 当0<=n<=9时,rst =1;
     *
     * @param k: An integer
     * @param n: An integer
     * @return: An integer denote the count of digit k in 1..n
     */
    public int digitCounts(int k, int n) {
        // write your code here
        if (n >= 0 && n <= 9) {
            return getCountByGewei(k, n);
        } else if (n >= 10 && n <= 99) {
            return getCountByShiwei(k, n);
        } else if (n >= 100 && n <= 999) {
            return getCountByBaiwei(k, n);
        }
        return -1;
    }

    public int getCountByGewei(int k, int gewei) {
        return k > gewei ? 0 : 1;
    }

    public int getCountByShiwei(int k, int n) {
        int gewei = n % 10;
        int shiwei = n / 10;
        int rst = 0;
        for (int i = 0; i < shiwei; i++) {
            rst += getCountByGewei(k, 9);
        }
        rst += getCountByGewei(k, gewei);
        if (k > shiwei) {

        } else if (k == shiwei) {
            rst = rst + gewei + 1;
        } else {
            rst += 10;
        }
        return rst;
    }

    public int getCountByBaiwei(int k, int n) {
        int two = n % 100;
        int baiwei = n / 100;
        int rst = 0;
        for (int i = 0; i < baiwei; i++) {
            rst += getCountByShiwei(k, 99);
        }
        rst = rst + getCountByShiwei(k, two);
        if (k == baiwei) {
            rst = rst + two + 1;
        } else if (k < baiwei) {
            rst = rst + 100;
        } else {

        }
        return rst;
    }

    public int guilv(int k, int n) {
        int rst = 0;
        int len = 0;
        int data = n;
        if (data == 0) {
            len = 1;
        } else {
            while (data > 0) {
                data = data / 10;
                len++;
            }
        }
        if (n >= 0 && n <= 9) {
            return k > n ? 0 : 1;
        } else {
            int chu = (int) Math.pow(10, len - 1);
            int cur = n / chu;
            int low = n % chu;
            for (int i = 0; i < cur; i++) {
                rst = rst + guilv(k, chu - 1);
            }
            rst = rst + guilv(k, low);
            if (k == cur) {
                rst = rst + low + 1;
            } else if (k < cur && k != 0) {
                rst = rst + chu;
            }
            return rst;
        }
    }

    public static void main(String[] args) {
        _003_DigitCounts ins = new _003_DigitCounts();
//        System.out.println(ins.digitCounts(2, 100));
        System.out.println(ins.guilv(0, 10));
    }
}
