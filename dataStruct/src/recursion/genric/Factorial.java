package recursion.genric;

import java.util.Scanner;

public class Factorial {

    public static int fact(int n){
        //Base Condition
        // n == 0 means 1
        if( n == 0){
            return 1;
        }
        //rec case
        // N * f(n-1)
        int ans = n * fact(n-1);
        return ans;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println("Factorial of the number"+ fact(n));
    }
}
