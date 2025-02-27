package basicprogram;

import java.util.Scanner;
public class adamnumber
{
   static int reverse(int num1) {
    int rev;
    int rever =  0;
    while(num1 > 0) {
        rev = num1 % 10;//2 1
       rever = (rever * 10) + rev;//21
       num1 /= 10;//1
    }
    return rever;
  }


    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        int num1 = ob.nextInt();
        int square = num1 * num1;
        int square1 = reverse(num1);
        int temp = square1 * square1;
        int actual = reverse(temp);
        if(actual == square) {
            System.out.println("Adam number");
        }
        else {
            System.out.println("Not a Adam Number");
        }
    }
}
