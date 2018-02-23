package easy;

public class _115_UniquePathsII {
    /**
     * @param obstacleGrid: A list of lists of integers
     * @return: An integer
     */
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        // write your code here
        if (obstacleGrid == null || obstacleGrid.length == 0) {
            return 0;
        }
        if (obstacleGrid[0] == null || obstacleGrid[0].length == 0) {
            return 0;
        }
        int height = obstacleGrid.length;
        int width = obstacleGrid[0].length;
        int[][] count = new int[height][width];
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if (obstacleGrid[i][j] != 1) {
                    if (i == 0 && j == 0) {
                        count[i][j] = 1;//初始点设为1
                    } else if (i == 0 || j == 0) {
                        count[i][j] = i == 0 ? count[i][j - 1] : count[i - 1][j];//上边缘和左边缘路径数为前一点路径数
                    } else {
                        count[i][j] = count[i][j - 1] + count[i - 1][j];//网格中间点路径数为上方和左方路径数之和
                    }
                } else {
                    count[i][j] = 0;
                }
            }
        }
        return count[height - 1][width - 1];
    }
}
