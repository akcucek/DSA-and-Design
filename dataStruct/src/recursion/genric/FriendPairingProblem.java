package recursion.genric;

//Question
/*
Given N friends who want to go party, each one can remain single or
can be paired up with some other friend. Each friend can be paired
only once,
Find out the total number of ways in which friends can remain single or can be paired ?

 */

import java.util.Scanner;

//Approach
/* Base Condition :
   N = 0 , 1 ways
   N = 1 , 1 ways
   N = 2 , 2 ways (a)(b) or (ab)
   N = 3 , 4 ways (a)(b)(c) or (ab)(c) or (ac)(b) or (a) (bc)
   N = 4 , ...

   if n = m ways , if single f(n) = 1(fixed) f(n-1)
                   if couple f(n) = n-1 C 1 * f(n-2) or (n-1) f(n-2)

                   f(n) = f(n-1) + (n-1)f(n-2)
 */
public class FriendPairingProblem {

    public static int pair(int n){
        //base condition
         if( n < 1){
             return 1;
         }
         if( n == 2){
             return 2;
         }
        //rec relation
        return pair(n-1) + (n-1)*pair(n-2);
    }
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        System.out.println(pair(n));
    }
}
