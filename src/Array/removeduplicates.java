package Array;
import java.util.Arrays;
public class removeduplicates {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 3, 3, 3};
        int rd = 0;
        int[] arr1 = new int[arr.length];
        arr1[rd++] = arr[0];
        for(int i = 0; i < arr.length - 1; i++) {
            if(arr[i] != arr[i + 1]) {
                arr1[rd++] = arr[i + 1];
            }
        }
        System.out.println(Arrays.toString(arr1));
    }
}
