package Array;
import java.util.Arrays;
public class alterposnegoptimal {
    public static void main(String[] args) {
        int[] arr = new int[]{1, -2, -3, -4, 5, 6, 7};
        int n = arr.length;
        int[] arr1 = new int[n];
        int pos = 0;
        int neg = 1;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] > 0) {
                arr1[pos] = arr[i];
                pos += 2;
            }
            else {
                arr1[neg] = arr[i];
                neg += 2;
            }
        }
        System.out.print(Arrays.toString(arr1));
    }
}
