package Array;
import java.util.HashMap;
public class twosumoptimal {
    static int[] twosum(int[] arr, int target) {

        int sum = 0;
        int rem = 0;
        HashMap<Integer, Integer> ans = new HashMap<>();
        for(int i = 0; i < arr.length; i++) {
            sum += arr[i];
            rem = target - arr[i];
            if(ans.containsKey(rem)) {
                return new int[]{i, ans.get(rem)};
            }
            else {
                ans.put(sum, i);
            }

        }
        return new int[]{};
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5};
        int target = 9;
        twosum(arr, target);
    }
}
