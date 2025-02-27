package twoDimensionalArray;

public class rotateimage {
    static void reverse(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            int left  = 0;
            int right = matrix.length - 1;

            while (left < right) {
                int temp = matrix[i][left];
                matrix[i][left] = matrix[i][right];
                matrix[i][right] = temp;
                left++;
                right--;
            }
        }
    }
    static void traverse(int[][] matrix) {
        for (int i = 0; i < matrix.length-1; i++) {
            for (int j = i+1; j < matrix.length; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        reverse(matrix);
    }
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {1, 2, 3}, {1, 2, 3}};
        traverse(matrix);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(" " + matrix[i][j]);
            }
            System.out.println();
        }
    }
}
