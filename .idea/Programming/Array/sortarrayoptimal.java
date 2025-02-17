package Array;

import java.util.Arrays;
public class sortarrayoptimal {
    static void sort(int[] arr) {
        int low = 0;
        int mid = 0;
        int high = arr.length - 1;
        while(mid <= high) {
            if (arr[mid] == 0) {
                int temp = arr[mid];
                arr[mid] = arr[low];
                arr[low] = temp;
                low++;
                mid++;
            }
            else if(arr[mid] == 1) {
                mid++;
            }
            else {
                int temp = arr[high];
                arr[high] = arr[mid];
                arr[mid] = temp;
                high--;
            }
        }
        System.out.print(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 1, 0, 0, 2};
        sort(arr);
    }
}
