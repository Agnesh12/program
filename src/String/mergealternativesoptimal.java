package String;

public class mergealternativesoptimal {
    static void merge(String string1, String string2) {
        int word1 = 0;
        int word2 = 0;
        StringBuilder ans = new StringBuilder();
        while (word1 < string1.length() || word2 < string2.length()) {
            if (word1 < string1.length()) {
                ans.append(string1.charAt(word1));
                word1++;
            }
            if (word2 < string2.length()) {
                ans.append(string2.charAt(word2));
                word2++;
            }
        }
        System.out.println(ans.toString());
    }
public static void main(String[] args) {
    String string1 = "Agnesh";
    String string2 = "Navin";
    merge(string1, string2);
}
}
