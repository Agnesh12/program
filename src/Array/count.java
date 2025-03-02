package Array;

public class count {
    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 1, 0, 1};
        int count  = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == 0 && arr[i + 1] == 1) {
                count += 2;
            }
        }
        System.out.println(count);
    }
}
