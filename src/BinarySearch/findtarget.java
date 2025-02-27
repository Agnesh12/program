package BinarySearch;

public class findtarget {
    static int binary(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;
        while(low <= high) {
            int mid = low + (high - low)/ 2;
            if(arr[mid] == target) {
                return mid;
            }
            else if(target > arr[mid]) {
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {1, 4, 5, 6, 8, 12, 14};
        int target = 12;
       int result = binary(arr, target);
        System.out.println(result);
    }
}
