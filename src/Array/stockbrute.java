package Array;

import java.sql.SQLOutput;

public class stockbrute {
    static void stock(int[] arr) {
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            for(int j = i + 1; j < arr.length; j++) {
                if(arr[j] > arr[i]) {
                    max = Math.max(max, arr[j] - arr[i]);
                }
            }
        }
        System.out.println(max);
    }
    public static void main(String[] args) {
       int[] arr = {7, 1, 2, 3, 6};
       stock(arr);
    }
}
