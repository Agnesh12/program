package Array;

public class pasncrbrute {
    static void pascal(int row,int col) {
        int res = 1;
        for(int i = 0; i < col; i++) {
            res = res * (row - i);
            res = res / (i + 1);
        }
        System.out.println(res);
    }
    public static void main(String[] args) {
        int n = 5;
        int row = 3;
        pascal(n - 1, row - 1);
    }
}

