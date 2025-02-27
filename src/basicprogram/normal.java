package basicprogram;
import java.util.ArrayList;
import java.util.Arrays;
public class normal {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        ans.add(new ArrayList<>(Arrays.asList(1, 2, 3)));
        ans.add(new ArrayList<>(Arrays.asList(1, 2, 3)));
        ans.add(new ArrayList<>(Arrays.asList(1, 2, 3)));
        System.out.println(ans);
    }
}
