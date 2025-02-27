package BinarySearch;

public class floor {
    public static void main(String[] args) {
        int[] arr = {2, 4, 5, 6, 8, 9};
        int target = 6;
        int low = 0;
        int ans = -1;
        int ans1 = -1;
        int high = arr.length - 1;
        while(low <= high) {
            int mid = low + (high - low) / 2;
            if(arr[mid] <= target) {
                ans = mid;
                low = mid + 1;

            }
            else {
                high = mid - 1;
            }
        }
        System.out.println(ans);
    }
}
