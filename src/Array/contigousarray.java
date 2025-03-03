package Array;
import java.util.HashMap;
public class contigousarray {
    static int findcont(int[] arr){
        int count = 0;
        int maxlength = 0;
        HashMap<Integer, Integer> ans = new HashMap<>();
        ans.put(0, -1);
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == 0) {
                count--;
            }
            else {
                count++;
            }
            if(ans.containsKey(count)){
                maxlength = Math.max(maxlength, i - ans.get(count));
            }
            else {
                ans.put(count, i);
            }

        }
        return maxlength;
    }
    public static void main(String[] args) {
        int[] arr = {0, 1, 1, 1, 0, 0};
        int result = findcont(arr);
        System.out.println(result);
    }
}
