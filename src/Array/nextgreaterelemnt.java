package Array;
import java.util.Arrays;
import java.util.Stack;
public class nextgreaterelemnt {
    static int nextgreater(Stack<Integer> ans, int arr) {
        while(!ans.empty() && ans.peek() <= arr) {
    ans.pop();
        }
        if (ans.empty()){
            return -1;
        }
        return ans.peek();
    }
    public static void main(String[] args) {
        int[] arr = {5, 6, 3, 2, 8, 1};
        Stack<Integer> ans = new Stack<>();
       int[] temparr = new int[arr.length];
        for(int i = arr.length - 1; i >= 0; i--) {
            temparr[i] = nextgreater(ans, arr[i]);
            ans.push(arr[i]);
        }
        System.out.print(Arrays.toString(temparr));
    }
}
