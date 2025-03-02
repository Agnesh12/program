package Array;
import java.util.Arrays;
public class thirdlargestnumber {
    static void largestnnumber(int[] arr) {
        int large = Integer.MIN_VALUE;
        int slarge = Integer.MIN_VALUE;
        int tlarge = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > large) {
                tlarge = slarge;
                slarge = large;
                 large = arr[i];
            }
            if (large != arr[i] && arr[i] > slarge) {
                tlarge = slarge;
                slarge = arr[i];
            }
            if(arr[i] != large && arr[i] != slarge && arr[i] > tlarge) {
                tlarge = arr[i];
            }
        }
        System.out.println(tlarge);
    }
    public static void main(String[] args) {
        int[] arr = {5, 4, 4, 3, 3};
        largestnnumber(arr);
    }
}
