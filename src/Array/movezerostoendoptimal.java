package Array;
import java.util.Arrays;
public class movezerostoendoptimal {
    public static void main(String[] args) {
        int[] arr = {0, 0, 0, 0, 5, 6, 5};
        int left = 0;
        int mid = 0;
        int right = arr.length;
        while(mid < right) {
            if(arr[mid] != 0) {
                int temp = arr[left];
                arr[left] = arr[mid];
                arr[mid] = temp;
                mid++;
                left++;
            }
            else {
                mid++;
            }

        }
        System.out.print(Arrays.toString(arr));
    }
}
