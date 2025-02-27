package BinarySearch;

public class findtargetrecurs {
    static int recur(int[] arr, int low, int high, int target) {
        if(low > high) {
            return -1;
        }
        int mid = low + (high - low) / 2;
        if(arr[mid] == target){
            return mid;
        }
        else if(target > arr[mid]) {
            low = mid + 1;
            return recur(arr, low, high, target);
        }
        else {
            high = mid - 1;
           return recur(arr, low, high, target);
        }
    }
    public static void main(String[] args) {
        int[] arr = {2, 4, 5, 7, 8, 12, 14};
        int target = 12;
        int low = 0;
        int high = arr.length - 1;
        int result = recur(arr, low, high, target);
        System.out.println(result);
    }
}
