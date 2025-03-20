import java.util.Stack;
public class expressevolution {
    public static void main(String[] args) {
        int a = 0;
        int b = 0;
        int sum = 0;
        String  str = "23*54*+9-";
        Stack<Integer> ans = new Stack();
        for(char ch : str.toCharArray()) {
            if (Character.isDigit(ch)) {
                ans.push(ch - '0');
            } else {
                a = ans.pop();
                b = ans.pop();

                if (ch == '+') {
                    sum = b+a;
                    ans.push(sum);
                    sum = 0;
                } else if (ch == '-') {
                    sum = b - a;
                    ans.push(sum);
                    sum = 0;
                } else if (ch == '*') {

                    sum = b * a;
                    ans.push(sum);
                    sum = 0;
                } else if (ch == '/') {
                    sum = b / a;
                    ans.push(sum);
                    sum = 0;
                }
            }
        }
        System.out.println(ans.pop());
    }


}
