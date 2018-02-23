package easy;

public class _114_UniquePaths {
    /**
     * @param m: positive integer (1 <= m <= 100)
     * @param n: positive integer (1 <= n <= 100)
     * @return: An integer
     * 动态规划题
     */
    public int uniquePaths(int m, int n) {
        // write your code here
        if (m == 0 || n == 0) {
            return m == 0 ? n : m;
        }
        int[][] count = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || j == 0) {//当处在网格最左边时，只能来自该点上方的点向下前进；当处于网格最上边时，只能来自该点的右方的点向右前进
                    count[i][j] = 1;
                } else {
                    //类似于跳台阶，要到达网格中的某一点只能是其上方或左方的点通过唯一路径到达该点，即为到达其上方的点和到达左方的点的路径数总和
                    count[i][j] = count[i - 1][j] + count[i][j - 1];
                }
            }
        }
        return count[m - 1][n - 1];
    }
}
