package Array;
import java.util.Arrays;

public class secondlargest {
    static void secondarr(int[] arr) {
        int slarge = Integer.MIN_VALUE;
        int large = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] > large) {
                slarge = large;
                large = arr[i];
            }
            if(arr[i] != large && arr[i] > slarge) {
                slarge = arr[i];
            }
        }
        System.out.println(slarge);
    }
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 3, 4, 1};
        secondarr(arr);
    }
}
