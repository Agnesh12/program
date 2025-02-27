package sorting;

import java.util.Arrays;
public class selectionsort {
    static void select(int[] arr) {
        for(int i = 0; i < arr.length - 1; i++) {
            int mini = i;
            for (int j =  i + 1; j < arr.length; j++) {
                if(arr[j] < arr[mini]) {
                        mini = j;
                }
            }
            int temp  = arr[mini];
            arr[mini] = arr[i];
            arr[i] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        select(arr);
    }
}
