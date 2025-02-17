package String;

import java.lang.StringBuilder;

public class lookandcount {
    static String generate(String str) {
        char currentchar = str.charAt(0);
        int count = 1;
        StringBuilder ans = new StringBuilder();
        for (int i = 1; i < str.length(); i++) {
            char nextcharacter = str.charAt(i);
            if(currentchar == nextcharacter) {
                count++;
            }
            else {
                ans.append(count).append(currentchar);
                currentchar = nextcharacter;
                count = 1;
            }
        }
        ans.append(count).append(currentchar);
        return ans.toString();
    }
    public static void main(String[] args) {
        String str = "1";
        System.out.println(str);
        for (int i = 0; i < 4; i++) {
             str = generate(str);
            System.out.println(str);
        }
    }
}
