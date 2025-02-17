package twoDimensionalArray;
import java.util.ArrayList;
import java.util.Arrays;
class zeromatrix {
    static void markrow(ArrayList<ArrayList<Integer>> matrix, int row, int col , int j) {
        for(int i = 0; i < row; i++) {
            if(matrix.get(i).get(j) != 0) {
                matrix.get(i).get(j);
                matrix.get(i).set(j, - 1);
            }
        }
    }
    static void markcol(ArrayList<ArrayList<Integer>> matrix, int row, int col, int i) {
        for(int j = 0; j < col; j++) {
            if(matrix.get(i).get(j) != 0) {
                matrix.get(i).get(j);
                matrix.get(i).set(j, -1);
            }
        }
    }
    static ArrayList<ArrayList<Integer>> Zero(ArrayList<ArrayList<Integer>> matrix, int row ,int col) {
        for(int i = 0; i < row; i++) {
            for(int j = 0; j < col; j++) {
                if(matrix.get(i).get(j) == 0) {
                    markrow(matrix, row, col, i);
                    markcol(matrix, row, col, j);
                }
            }
        }
        for(int i = 0; i < row; i++) {
            for(int j = 0; j < col; j++) {
                if(matrix.get(i).get(j) == -1) {



                    matrix.get(i).set(j, 0);
                }
            }
        }
        return matrix;
    }
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();
        matrix.add(new ArrayList<>(Arrays.asList(1, 1, 1)));
        matrix.add(new ArrayList<>(Arrays.asList(1, 0, 1)));
        matrix.add(new ArrayList<>(Arrays.asList(1, 1, 1)));
        int row = matrix.size();
        int col = matrix.get(0).size();
        ArrayList<ArrayList<Integer>> ans = Zero(matrix, col, row);
        for(ArrayList<Integer> num : ans) {
            for(Integer result : num) {
                System.out.print(" " + result);
            }
            System.out.println();
        }
    }
}
