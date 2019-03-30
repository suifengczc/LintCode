package middle;

/**
 * 392. 打劫房屋
 * <p>
 * 假设你是一个专业的窃贼，准备沿着一条街打劫房屋。
 * 每个房子都存放着特定金额的钱。
 * 你面临的唯一约束条件是：
 * 相邻的房子装着相互联系的防盗系统，
 * 且当相邻的两个房子同一天被打劫时，该系统会自动报警。
 * <p>
 * 给定一个非负整数列表，表示每个房子中存放的钱，
 * 算一算，如果今晚去打劫，在不触动报警装置的情况下, 你最多可以得到多少钱 。
 * <p>
 * 样例
 * 样例 1:
 * <p>
 * 输入: [3, 8, 4]
 * 输出: 8
 * 解释: 仅仅打劫第二个房子.
 * 样例 2:
 * <p>
 * 输入: [5, 2, 1, 3]
 * 输出: 8
 * 解释: 抢第一个和最后一个房子
 * 挑战
 * O(n) 时间复杂度 且 O(1) 存储。
 */
public class _392_HouseRobber {
    /**
     * 思路1：
     * 1.对于x位置的房子，它的前一个房子一定是小于x-1的，至少间隔1个
     * 2.最后一个房子一定是倒数第一或倒数第二个
     * 3.选择前一个的标准是间隔一个还是两个
     * 递归实现
     * 不能做到O(n) 时间复杂度 且 O(1) 存储
     *
     * 失败
     *
     * 思路2：
     * 使用数组dp来表示打劫当前房子时的收益最大值
     * 1.当打劫当前房子i时，dp[i] = dp[i-2] + A[i]
     * 2.当不打劫当前房子时，dp[i] = dp[i-1]
     * 3.所以当前房子的最大收益应该时Math.max(dp[i-1],dp[i-2] + A[i])
     *
     * 时间复杂度O(n),空间复杂度O(n)
     *
     *
     * 思路3：
     * 优化空间复杂度
     *
     */

    /**
     * @param A: An array of non-negative integers
     * @return: The maximum amount of money you can rob tonight
     */
    public long houseRobber(int[] A) {
        // write your code here
        if (A == null || A.length == 0) {
            return 0;
        } else if (A.length == 1) {
            return A[0];
        } else if (A.length == 2) {
            return Math.max(A[0], A[1]);
        }

        //这里把思路2中的数组换成两个变量表示，
        // 因为数组中每次也只是用了相邻的两个值，
        // 完全可以用两个变量来代替数组
        long minus_1 = A[1];
        long minus_2 = A[0];
        long temp = 0;//把temp放在for循环外能缩短耗时
        for (int i = 2; i < A.length; i++) {
            temp = minus_1;
            minus_1 = Math.max(temp, minus_2 + A[i]);
            minus_2 = temp;
        }
        return minus_1;


        /*
        //思路2
        if (A == null || A.length == 0) {
            return 0;
        } else if (A.length == 1) {
            return A[0];
        } else if (A.length == 2) {
            return Math.max(A[0], A[1]);
        }
        long[] dp = new long[A.length];
        dp[0] = A[0];
        dp[1] = Math.max(dp[0],A[1]);
        for (int i = 2; i < A.length; i++) {
            dp[i] = Math.max(dp[i - 1], dp[i - 2] + A[i]);
        }

        return dp[A.length - 1];
        */


        /*
        //思路1
        if (A == null || A.length == 0) {
            return 0;
        } else if (A.length == 1) {
            return A[0];
        }
        long lastOne = getLastSum(A, A.length - 1);
        long lastTwo = getLastSum(A, A.length - 2);
        return lastOne > lastTwo ? lastOne : lastTwo;
        */
    }

    public long getLastSum(int[] A, int curIndex) {
        long sum = 0;
        if (curIndex == 1 || curIndex == 0) {
            return A[curIndex];
        } else if (curIndex == 2) {
            return A[curIndex] + A[0];
        }

        long subOne = getLastSum(A, curIndex - 2);
        long subTwo = getLastSum(A, curIndex - 3);
        if (subOne > subTwo) {
            sum = subOne + A[curIndex];
        } else {
            sum = subTwo + A[curIndex];
        }
        return sum;
    }

    public static void main(String[] args) {
//        int[] a = new int[]{828, 125, 740, 724, 983, 321, 773, 678, 841, 842, 875, 377, 674, 144, 340, 467, 625, 916, 463, 922, 255, 662, 692, 123, 778, 766, 254, 559, 480, 483, 904, 60, 305, 966, 872, 935, 626, 691, 832, 998, 508, 657, 215, 162, 858, 179, 869, 674, 452, 158, 520, 138, 847, 452, 764, 995, 600, 568, 92, 496, 533, 404, 186, 345, 304, 420, 181, 73, 547, 281, 374, 376, 454, 438, 553, 929, 140, 298, 451, 674, 91, 531, 685, 862, 446, 262, 477, 573, 627, 624, 814, 103, 294, 388};
//        int[] a = new int[]{5, 2, 1, 3};
        int[] a = new int[]{3, 8, 4};
        _392_HouseRobber test = new _392_HouseRobber();
        System.out.println(test.houseRobber(a));
    }
}
