package Array;

public class majorityelementbrute {
    static void majority(int[] arr) {
        int num = arr.length / 2;
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for(int j = i; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                        count++;
                }
            }
            if(count > num) {
                System.out.print(arr[i]);
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 1, 1, 1, 2};
        majority(arr);
    }
}
