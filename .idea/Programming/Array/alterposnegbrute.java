package Array;
import java.util.Arrays;
import java.util.ArrayList;
public class alterposnegbrute {
    public static void alter(int[] arr) {
        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<>();
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] > 0) {
                pos.add(arr[i]);
            }
            else {
                neg.add(arr[i]);
            }
        }
        for(int i =0 ; i < arr.length / 2; i++) {
            arr[i * 2] = pos.get(i);
            arr[i * 2 + 1] = neg.get(i);
        }
        System.out.println(Arrays.toString(arr));

    }
    public static void main(String[] args) {
        int[] arr = {5, -1, -2, -3, 4, 7};
        alter(arr);
    }
}
