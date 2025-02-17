package Array;
import java.util.Arrays;
public class rotateby1
{
    static void rotate(int[] arr, int rot) {
        rot = rot % arr.length;
        reverse(arr, 0, arr.length - 2);
        reverse(arr, arr.length - rot, arr.length - rot);
        reverse(arr, 0, arr.length - 1);
        System.out.print(Arrays.toString(arr));
    }
    static void reverse(int[] arr, int start, int end) {
        while(start <= end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        int rot = 1;
        rotate(arr, rot);
    }
}
