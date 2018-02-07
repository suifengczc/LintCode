package easy;

public class _028_SearchMatrix {
    public static boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null||matrix.length == 0) {
            return false;
        }
        int height = matrix.length - 1;
        int widget = matrix[0].length - 1;
        if (target < matrix[0][0] || target > matrix[height][widget]  ) {
            return false;
        }
        for (int i = 0; i <= height; i++) {
            if (matrix[i][0] <= target && matrix[i][widget] >= target) {
                int start = 0;
                int end = widget;
                int middle = (start + end) / 2;
                while (start <= end) {
                    if (matrix[i][middle] == target) {
                        return true;
                    } else if (matrix[i][middle] > target) {
                        end = middle - 1;
                        middle = (start + end) / 2;
                    } else if (matrix[i][middle] < target) {
                        start = middle + 1;
                        middle = (start + end) / 2;
                    }
                }
                return false;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] a = {{1,3,5,7},{10,11,16,20},{23,30,34,50}};
        System.out.println(searchMatrix(a,7));
    }
}
