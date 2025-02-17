package Array;
import java.util.Arrays;
public class maximumsubarrayoptimal {
    static void subarray(int[] arr) {
        int sum  = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (sum > max) {
                max = sum;
            }
            if(sum < 0) {
                sum  = 0;
            }
        }
        System.out.println(max);
    }
    public static void main(String[] args) {
        int[] arr = {4, -1, -2, 5, 4, -2, 5};
        subarray(arr);
    }
}
