package Pattern;

public class prymid {
    static void pattern(int len) {
        for(int i = 0; i < len; i++) {
            for(int j = len - 1; j > i; j--) {
                System.out.print(" ");
            }
            for(int k = 0; k < i * 2 + 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int num = 5;
        pattern(num);
    }
}
