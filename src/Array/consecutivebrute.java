package Array;

public class consecutivebrute {
    static boolean large(int[] arr, int num) {
        int len  = arr.length;
        for(int i = 0; i < len; i++) {
            if(arr[i] == num) {
                return true;
            }
        }
        return false;
    }
    static int findconsecutive(int[] arr, int len) {
        int longest = 1;
        for(int i = 0; i < len; i++) {
            int x = arr[i];
            int cnt  = 1;
            while(large(arr, x + 1) == true) {
                x += 1;
                cnt += 1;
            }
            longest = Math.max(longest, cnt);
        }
        return longest;
    }
    public static void main(String[] args) {
        int[] arr = {100, 101, 102, 103, 104, 200, 1, 2, 3, 4};
        int len = arr.length;
        int result = findconsecutive(arr, len);
        System.out.println(result);
    }
}
