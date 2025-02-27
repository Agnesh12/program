package twoDimensionalArray;

public class snakepattern {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
        int top = 0;
        int left = 0;
        int right = matrix[0].length - 1;
        int bottom = matrix.length - 1;
        while(top <= bottom && left <= right) {
            for(int i = left; i <= right; i++) {
                System.out.print(" " + matrix[top][i]);
            }
            top++;
            for(int i = right; i >= left; i--) {
                System.out.print(" " + matrix[top][i]);
            }
            top++;
        }
    }
}
