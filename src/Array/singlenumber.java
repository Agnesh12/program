package Array;

public class singlenumber {
    static void single(int[] arr, int xor) {
        for(int i = 0; i < arr.length; i++) {
            xor ^= arr[i];
        }
        System.out.println(xor);
    }
    public static void main(String[] args) {
         int[] arr = { 2, 2, 1, 1, 5};
         int xor = 0;
         single(arr, xor);
    }
}
