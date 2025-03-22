package Pattern;

public class pattern6 {
    public static void main(String[] args) {
        int num = 5;
        int count= 1;
        for(int i = 1; i <= num; i++) {
            count = i;
            for(int j = num - 1; j >= i; j--) {
                System.out.print(" ");
            }
            for(int k = 1; k <= i; k++) {
                System.out.print(count--);
            }
            System.out.println();
        }
    }
}
