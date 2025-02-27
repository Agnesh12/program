package BinarySearch;

public class searchnumber2dmatrix {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int m = arr.length;
        int n = arr[0].length;
        int low = 0;
        int high = (m * n) - 1;
       int target = 4;
        while(low <= high) {
            int mid =  low + (high - low) / 2;
            int row = mid / n;
            int col = mid % n;
            if(arr[row][col] == target) {
                System.out.println("true");
                break;
            }
            else if(arr[row][col] < target) {
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }
    }
}
