package Array;
import java.util.HashSet;
public class consecutiveoptimal {
    static int findconsecutive(int[] arr) {
        int longest = 0;
        int count  = 0;
        int x = 0;
        HashSet<Integer> ans = new HashSet<>();
        for(int i = 0; i < arr.length; i++) {
            ans.add(arr[i]);
        }
        for(int it : ans) {
            if(!ans.contains(it - 1)) {
                count = 1;
                x = it;
                while(ans.contains(x + 1)) {
                    x += 1;
                    count = count + 1;

                }

            }
            longest = Math.max(longest, count);
        }
        return longest;
    }
    public static void main(String[] args) {
        int[] arr = {100, 200, 1, 2, 3, 4};
        int result = findconsecutive(arr);
        System.out.println(result);
    }
}
