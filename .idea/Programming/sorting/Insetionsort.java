package sorting;
import java.util.Arrays;

public class Insetionsort {
    static void sort(int[] arr) {
        for(int i = 0; i <= arr.length - 1; i++) {
            int j =i;
            while(j > 0 && arr[j - 1] > arr[j]) {
                int temp = arr[j - 1];
                arr[j - 1] = arr[j];
                arr[j] = temp;
                j--;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {


        int[] arr = {5, 4, 3, 2, 1};
        sort(arr);
    }
}
