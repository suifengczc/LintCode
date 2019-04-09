package middle;


/**
 * 74. 第一个错误的代码版本
 * <p>
 * 代码库的版本号是从 1 到 n 的整数。
 * 某一天，有人提交了错误版本的代码，
 * 因此造成自身及之后版本的代码在单元测试中均出错。
 * 请找出第一个错误的版本号。
 * <p>
 * 你可以通过 isBadVersion 的接口来判断版本号 version 是否在单元测试中出错，
 * 具体接口详情和调用方法请见代码的注释部分。
 * <p>
 * 样例
 * n = 5:
 * <p>
 * isBadVersion(3) -> false
 * isBadVersion(5) -> true
 * isBadVersion(4) -> true
 * <p>
 * 因此可以确定第四个版本是第一个错误版本。
 * 挑战
 * 调用 isBadVersion 的次数越少越好
 * <p>
 * 注意事项
 * 请阅读代码编辑框内注释代码，
 * 获取对于不同语言正确调用 isBadVersion 的方法，
 * 比如java的调用方式是SVNRepo.isBadVersion(v)
 */
public class _074_FindFirstBadVersion {
    /**
     * 思路：类似于在数组{1,2,3,4,4,4,4,5,6,7}中找出第一个4
     * 二分法可以快速判断数组中是否包含4和定位其中一个4的位置，但这个位置不一定是第一个4
     * <p>
     * ps:当n==2147483647时，二分法越界
     *
     * @param n: An integer
     * @return: An integer which is the first bad version.
     */
    public int findFirstBadVersion(int n) {
        // write your code here
        int start = 1;
        int end = n;
        int middle = (start >> 1) + (end >> 1);
        while (start <= end) {
            if (start == end) {
                return end;
            }
            if (SVNRepo.isBadVersion(middle)) {
                end = middle;
            } else {
                start = middle + 1;
            }
            middle = (start >> 1) + (end >> 1);
        }
        return middle;
    }

    public static void main(String[] args) {
        _074_FindFirstBadVersion test = new _074_FindFirstBadVersion();
        System.out.println(test.findFirstBadVersion(2147483647));
    }

}
