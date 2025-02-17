package Pattern;

 class xpattern {
    static void pattern(int len) {
       for(int i = 1; i <= len; i++) {
           for(int j = 1; j <= len; j++) {
               if(i == j || i + j == len + 1) {
                   System.out.print("*");
               }
               else {
                   System.out.print(" ");
               }
           }
           System.out.println();
       }
    }
    public static void main(String[] args) {
        int n = 5;
        pattern(n);
    }
}
