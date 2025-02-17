package Pattern;

public class box {
    static void pattern(int len) {
        for(int i = 1; i <= len; i++) {
            for(int j = 1; j <= len; j++) {
                if(i == 1 || j == 1 || i == len || j == len) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int num = 5;
        pattern(num);
    }
}
