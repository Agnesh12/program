package Array;
import java.util.HashMap;
public class presumk {
    static int presum(int[] arr, int target) {
        int count = 0;
        int sum = 0;
        HashMap<Integer, Integer> ans =  new HashMap<>();
        ans.put(0, 1);
        for(int i = 0; i < arr.length; i++) {
            sum += arr[i];
            int rem = sum - target;
            count += ans.getOrDefault(rem, 0);
            ans.put(sum, ans.getOrDefault(sum , 0) + 1);
        }
        return count;
    }
    public static void main(String[] args) {
        int[] arr = { 1, 1, 1};
        int target = 2;
       int result =  presum(arr, target);
        System.out.println(result);
    }
}
