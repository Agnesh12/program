package Array;
import java.util.Arrays;
public class maximumsubarrayuptomax {
    static void subarray(int[] arr) {
        int sum = 0;
        int max = Integer.MIN_VALUE;
        int start = 0;
        int ansstart = -1;
        int ansend = -1;
        for(int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if(sum == 0) {
                start = i;
            }
            if (sum > max) {
                max = sum;
                ansstart = start;
                ansend = i;
            }
            if (sum < 0) {
                sum = 0;
            }
        }
        System.out.print("The subarray is: [");
        for (int i = ansstart; i <= ansend; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.print("]n");

    }
    public static void main(String[] args) {
        int[] arr = {-2, 3, 4, -2, 7};
        subarray(arr);
    }
}
