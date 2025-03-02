package GreedyAlgorithm;

public class jumpgame {
    static void game(int[] arr){
        int reach = 0;
        for(int i = 0; i < arr.length; i++) {
            if(i > reach){
                System.out.println("False");
            }
            reach = Math.max(reach, arr[i] + i);
        }
        System.out.println("True");

    }
    public static void main(String[] args) {
        int[] arr = {3, 2, 1, 0, 4};
        game(arr);
    }
}
