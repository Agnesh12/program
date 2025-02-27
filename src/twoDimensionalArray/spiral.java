package twoDimensionalArray;

class spiral {
    static void matrix(int[][] arr) {
        int left = 0;
        int right = arr.length - 1;
        int top = 0;
        int bottom = arr.length - 1;
        while(left <= right && top <= bottom) {
            for (int i = left; i <= right; i++) {
                System.out.print(" " + arr[top][i]);
            }
            top++;
            for (int i = top; i <= bottom; i++) {
                System.out.print(" " + arr[i][right]);
            }
            right--;
            if(top <= bottom) {
                for (int i = right; i >= left; i--) {
                    System.out.print(" " + arr[bottom][i]);
                }
                bottom--;
            }
            if(left < right) {
                for(int i = bottom; i >= top; i--) {

                    System.out.print(" " + arr[i][left]);
                }
                left++;
            }
        }

    }
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        matrix(arr);
    }
}