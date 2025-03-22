package Pattern;

public class pattern5 {
    public static void main(String[] args) {
        int count = 1;
        int temp = 0;
        int num = 5;
        for(int i = num - 1; i >= 0; i--) {
            for(int j = num - 1 ; j >= i; j--) {
                if(j == num - 1) {
                    System.out.print(count + " ");
                    temp = count;
                    count++;

                }
                else {
                    temp += j + 1;
                    System.out.print(temp + " ");

                }
            }
            System.out.println();
        }
    }
}
