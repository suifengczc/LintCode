package easy;

import java.util.jar.JarEntry;

public class _109_Triangle {
    /**
     * @param triangle: a list of lists of integers
     * @return: An integer, minimum path sum
     */
    public int minimumTotal(int[][] triangle) {
        // topToBottom
        if (null == triangle || 0 == triangle.length) {
            return -1;
        }
        if (null == triangle[0] || 0 == triangle[0].length) {
            return -1;
        }
        int len = triangle.length;
        int min = Integer.MAX_VALUE;
        int[][] sumMin = new int[len][len];//将每条路径的每个节点的和都保存在这个数组中，输出最后一行的最小值即为最小路径和
        sumMin[0][0] = triangle[0][0];
        for (int i = 1; i < len; i++) {
            for (int j = 0; j < i + 1; j++) {
                if (j == 0) {
                    sumMin[i][j] = sumMin[i - 1][j] + triangle[i][j];//第一项只能从上一行的第一项向左得到
                } else if (j == i) {
                    sumMin[i][j] = sumMin[i - 1][j - 1] + triangle[i][j];//最后一项只能由上一行的最后一项向右得到
                } else {
                    sumMin[i][j] = Math.min(sumMin[i - 1][j - 1], sumMin[i - 1][j]) + triangle[i][j];
                }
                if (i == len - 1 && sumMin[i][j] < min) {
                    min = sumMin[i][j];
                }
            }
        }
        return min == Integer.MAX_VALUE ? sumMin[0][0] : min;//如果triangle只有一个值，就输出sumMin[0][0]
    }

}
