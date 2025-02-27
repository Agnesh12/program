package SlidingWindow;

public class noofsubstringcontainingallthreechar {
    static int findcount(String str) {
        int count = 0;
        int[] visit = {-1, -1, -1};;
        for(int i = 0; i < str.length(); i++) {
            visit[str.charAt(i) - 'a'] = i;
            count = count + (1 + Math.min(visit[0], Math.min(visit[1], visit[2])));
        }
        return count;
    }
    public static void main(String[] args) {
        String str = "abcabc";
        int result = findcount(str);
        System.out.println(result);
    }
}
