package Pattern;

public class pattern8 {
    static void print(String ans, int num) {
        int count = 0;
        for(int i = 1; i <= num; i++) {
            for(int j = 1; j <= num; j++) {
                if(i == 1 || i == num || i + j == num + 2) {
                    System.out.print( " " + ans.charAt(count));
                    count++;
                }
                else {
                    System.out.print( " " + " ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        String str = "zohocorporationteam";
        int num = 7;
        print(str, num);
    }
}
