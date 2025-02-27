package Array;

public class stockoptimal {
    static void stock(int[] arr) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++) {
            min = Math.min(arr[i], min);
            max = Math.max(arr[i] - min, max);
        }
        System.out.println(max);
    }
    public static void main(String[] args) {
        int[] arr = {7, 1, 4, 5, 6};
        stock(arr);
    }
}
