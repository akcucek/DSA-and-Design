package recursion.genric;

import java.util.Scanner;

//Question : Sum of Digit
public class SumOfDigits {

    public static int sum(int n){
        //base condition
        if( n ==0){
            return 0;
        }
        //rec case : F(n) = F(n/10) + n%10
        int sum = n%10 + sum(n/10);
        return sum;
    }
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        System.out.println("Sum of Digits :"+ sum(n));
    }
}
