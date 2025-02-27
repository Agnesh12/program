package Backtracking;
import java.util.List;
import java.util.ArrayList;
public class ratinamaze {
    static List<String> findpath(int[][] path, int len) {

        int[][] visited = new int[len][len];
        for(int i = 0; i < len; i++) {
            for(int j = 0; j < len; j++) {
                visited[i][j] = 0;
            }
        }
        ArrayList<String> ans = new ArrayList<>();
        solve(ans, path, visited, 0, 0, len, "");
        return ans;
    }
    static ArrayList<String> solve(ArrayList<String> ans, int[][] path, int[][] visited, int row, int col, int len,  String move) {
        if(row == len - 1 && col == len - 1) {
            ans.add(move);
            return ans;
        }
        //down
        if(row + 1 < len && path[row + 1][col] == 1 && visited[row + 1][col] == 0) {
            visited[row + 1][col] = 1;
            solve(ans, path, visited, row + 1, col, len, move + 'D');
            visited[row + 1][col] = 0;
        }
        //left
        if(col - 1 >= 0 && path[row][col - 1] == 1 && visited[row][col - 1] == 0) {
            visited[row][col - 1] = 1;
            solve(ans, path, visited, row, col - 1, len, move + 'L');
            visited[row][col - 1] = 0;
        }
        //Up
        if(row - 1 >= 0 && path[row - 1][col] == 1 && visited[row - 1][col] == 0) {
            visited[row - 1][col] = 1;
            solve(ans, path, visited, row - 1, col, len, move + 'U');
            visited[row - 1][col] = 0;
        }
        //right
        if(col + 1 < len && path[row][col + 1] == 1 && visited[row][col + 1] == 0) {
            visited[row][col + 1] = 1;
            solve(ans, path, visited, row, col + 1, len, move + 'R');
            visited[row][col + 1] = 0;
        }
        return ans;
    }
    public static void main(String[] args) {
        int[][] matrix = {{1, 0, 0, 0}, {1, 1, 0, 0}, {1, 1, 0, 0}, {0, 1, 1, 1}};
        int len  = matrix.length;
        List<String> ans = findpath(matrix, len);
        for(String str : ans) {
            System.out.println(str);
        }
    }
}
