package easy;

import javax.swing.event.TableColumnModelEvent;

public class _110_MinimumPathSum {
    /**
     * @param grid: a list of lists of integers
     * @return: An integer, minimizes the sum of all numbers along its path
     */
    public int minPathSum(int[][] grid) {
        // write your code here
        if (null == grid || 0 == grid.length) {
            return -1;
        }
        if (null == grid[0] || 0 == grid[0].length) {
            return -1;
        }
        int row = grid.length;
        int column = grid[0].length;
        int[][] sumMin = new int[row][column];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                if (i == 0) {
                    if (j == 0) {
                        sumMin[0][0] = grid[0][0];
                    } else {
                        sumMin[i][j] = sumMin[i][j - 1] + grid[i][j];
                    }
                } else if (j == 0) {
                    sumMin[i][j] = sumMin[i - 1][j] + grid[i][j];
                } else {
                    sumMin[i][j] = Math.min(sumMin[i][j - 1], sumMin[i - 1][j]) + grid[i][j];
                }
            }
        }
        return sumMin[row - 1][column - 1];
    }
}
