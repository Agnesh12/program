package Array;
import java.util.HashMap;
import java.util.Map;
public class majorityelementbetter {
    static int majority(int[] arr, int len) {
        HashMap<Integer, Integer> ans = new HashMap<>();
        for(int i = 0; i < arr.length; i++) {
            int value = ans.getOrDefault(arr[i], 0);
            ans.put(arr[i], value + 1);
        }
        for (Map.Entry<Integer, Integer> it : ans.entrySet()) {
            if(it.getValue() > (len / 2)) {
                return it.getKey();
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 2, 2, 2, 2};
        int len = arr.length;
        System.out.print(majority(arr, len));
    }
}
