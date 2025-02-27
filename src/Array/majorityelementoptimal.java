package Array;
import java.util.Arrays;
public class majorityelementoptimal {
    static void major(int[] arr)
    {
        int len = arr.length;
        int count = 0;
        int element = 0;
        for (int i = 0; i < arr.length; i++) {
            if (count == 0) {
                count = 1;
                element = arr[i];
            } else if (element == arr[i]) {
                count++;
            } else {
                count--;
            }
        }
            int count1 = 0;
            for (int i = 0; i < arr.length; i++) {
                if(element == arr[i]) {
                    count1++;
                }
            }
            if (count1 > (len / 2)) {
                System.out.println(element);
            }

    }
    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 2, 2, 2, 2};
        major(arr);
    }
}
