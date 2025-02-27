package Array;
import java.util.Arrays;
public class twosumbrute {
    static void sum(int[] arr, int target) {
        for(int i = 0; i < arr.length - 1; i++) {
            for(int j = i + 1; j < arr.length; j++) {
                if(arr[i] + arr[j] == target) {
                    System.out.print(i + " ");
                    System.out.print(j);
                }
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 5, 4, 7};
        int target = 9;
        sum(arr, target);
    }
}
