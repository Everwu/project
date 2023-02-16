package src;

public class LC0240 {
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0 || matrix[0] == null || matrix[0].length == 0) {
            return false;
        }
        // start -> bottom-left
        int row = matrix.length - 1;
        int col = 0;

        while (row >= 0 && col < matrix[0].length) {

            if (matrix[row][col] > target) {
                row--;
            }
            else if (matrix[row][col] < target) {
                col++;
            } else { // found it
                return true;
            }
        }
        return false;
    }

}
