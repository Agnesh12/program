package GreedyAlgorithm;

public class jumpgame {
    static boolean game(int[] arr){
        int reach = 0;
        for(int i = 0; i < arr.length; i++) {
            if(i > reach){
                return false;
            }
            reach = Math.max(reach, arr[i] + i);
        }
        return true;

    }
    public static void main(String[] args) {
        int[] arr = {3, 2, 1, 0, 4};

        System.out.println(game(arr));
    }
}
