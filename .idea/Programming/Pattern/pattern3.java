package Pattern;

public class pattern3 {
    static void pattern(int num) {
        for(int i = 0; i < num; i++) {
            for(int j = num - 1; j > i; j--) {
                System.out.print(" ");
            }
            for(int k = 0; k <= i; k++) {
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
