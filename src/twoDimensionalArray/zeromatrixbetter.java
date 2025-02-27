package twoDimensionalArray;
import java.util.ArrayList;
import java.util.Arrays;
public class zeromatrixbetter {
    static ArrayList<ArrayList<Integer>> zeromatrix(ArrayList<ArrayList<Integer>> matrix, int row, int col) {
        int[] n = new int[row];
        int[] m = new int[col];
        for(int i = 0; i < row; i++) {
            for(int j = 0; j < col; j++) {
                if(matrix.get(i).get(j) == 0) {
                    n[i]  = 1;
                    m[j] = 1;
                }
            }
        }
        for(int i = 0; i < row; i ++) {
            for(int j = 0; j < col; j++) {
                if(n[i] == 1 || m[j] == 1) {
                    matrix.get(i).set(j, 0);
                }
            }
        }
        System.out.println(matrix);
        return matrix;
    }
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();
        matrix.add(new ArrayList<>(Arrays.asList(1, 1, 1)));
        matrix.add(new ArrayList<>(Arrays.asList(1, 0, 1)));
        matrix.add(new ArrayList<>(Arrays.asList(1, 1, 1)));
        int row = matrix.size();
        int col = matrix.get(0).size();
        ArrayList<ArrayList<Integer>> ans = zeromatrix(matrix, row, col);

    }
}
