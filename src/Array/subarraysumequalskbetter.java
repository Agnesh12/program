package Array;

public class subarraysumequalskbetter {
    static void equals(int[] arr, int target) {
        int count = 0;
        for(int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum += arr[j];
                if(sum == target) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
    public static void main(String[] args) {
        int[] arr = {1, 1, 1};
        int target = 2;
        equals(arr, target);
    }
}
