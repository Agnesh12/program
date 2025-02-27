package Array;
import java.util.Arrays;
public class largestnumber {
    static void largest(int[] arr) {
        int large = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > large) {
                large = arr[i];
            }
        }
        System.out.println(large);
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        largest(arr);
    }
}
