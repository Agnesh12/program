package Array;

public class consecutivebetter {
    static int findconsecutive(int[] arr) {
        int longest = 0;
        int lastsmaller = Integer.MIN_VALUE;
        int count = 0;
        for(int  i  = 0; i < arr.length; i++) {
            if(arr[i] - 1 == lastsmaller) {
                count += 1;
                lastsmaller = arr[i];
            }
            else if(arr[i] != lastsmaller) {
                count = 1;
                lastsmaller = arr[i];
            }
            longest = Math.max(longest, count);
        }
        return count;
    }
    public static void main(String[] args) {
        int[] arr = {1, 0, 1, 2};
        int result =  findconsecutive(arr);
        System.out.println(result);
    }
}
