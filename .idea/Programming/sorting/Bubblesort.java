package sorting;
import java.util.Arrays;
public class Bubblesort {
    static void sort(int[] arr) {
        int len = arr.length;
        for(int i = len - 1; i >= 0; i--) {
            for(int j = 0; j <= i - 1; j++) {
                if(arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        sort(arr);
    }
}
