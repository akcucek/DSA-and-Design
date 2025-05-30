package recursion;

import java.util.Scanner;

public class ReverseOfNumber {

    public static int reverse(int n) {
        //base condition


        // Rec relation : f(n) = n%10 + f(n/10)
        return 1;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        System.out.println("Reverse of Number :" + reverse(n));
    }
}