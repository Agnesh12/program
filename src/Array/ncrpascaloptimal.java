package Array;

public class ncrpascaloptimal {
    static int ncr(int n, int row) {
        int res = 1;
        for(int i = 0; i < row; i++) {
            res = res * (n - i);
            res = res / (i + 1);
        }
        return res;
    }
    public static void main(String[] args) {
        int n = 5;
        for(int row =  1; row <= n; row++) {
            for(int col = 1; col <= row; col++) {
                System.out.print(" " + ncr(row - 1, col - 1));
            }
            System.out.println();
        }
    }
}
