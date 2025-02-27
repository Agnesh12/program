package Array;

public class ncrrowbetter {
    static int ncr(int n, int row) {
        int res = 1;
        for(int i = 0; i < row; i++)  {
            res = res * (n - i);
            res = res / (i + 1);
        }
        return res;
    }
    static void pascaltriangle(int n) {
        for(int col = 1; col <= n; col++) {
            System.out.print(" " + ncr(n - 1, col - 1));
        }
    }
    public static void main(String[] args) {
        int n = 5;
        pascaltriangle(n);
    }
}
