package easy;

public class _185_MatrixZigzagTraversal {
    /**
     * @param matrix: An array of integers
     * @return: An array of integers
     */
    public static int[] printZMatrix(int[][] matrix) {
        // write your code here
        if (matrix == null)
            return null;
        int height = matrix.length;
        int width = matrix[0].length;
        int[] result = new int[height * width];
        int xIndex = 0;
        int yIndex = 0;
        int count = 0;
        result[count++] = matrix[0][0];
        while ((xIndex < width || yIndex < height) && count < height * width) {
            if (xIndex + 1 < width) {
                result[count++] = matrix[yIndex][++xIndex];
            } else {
                if (yIndex + 1 < height && xIndex < width) {
                    result[count++] = matrix[++yIndex][xIndex];
                } else {
                    break;
                }
            }
            for (; xIndex - 1 >= 0 && yIndex + 1 < height; ) {
                result[count++] = matrix[++yIndex][--xIndex];
            }
            if (xIndex - 1 < 0) {
                if (yIndex + 1 >= height) {
                    result[count++] = matrix[yIndex][++xIndex];
                } else {
                    result[count++] = matrix[++yIndex][xIndex];
                }
            } else {
                if (xIndex + 1 < width) {
                    result[count++] = matrix[yIndex][++xIndex];
                }
            }
            for (; xIndex + 1 < width && yIndex - 1 >= 0 && count < height * width; ) {
                result[count++] = matrix[--yIndex][++xIndex];
            }
        }
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + ",");
        }
        return result;
    }

    public static void main(String[] args) {
//        int[][] a = {{1, 2, 3, 4, 5}, {1, 2, 3, 4, 5}};
//        int[][] a = {{1}, {2},{3},{4},{5}};
//        int[][] a = {{1,2,3,4,5}};
        int[][] a = {{1, 2, 3, 4},
                    {6, 7, 8, 9},
                    {10, 11, 12, 13}};
        printZMatrix(a);
    }
}
