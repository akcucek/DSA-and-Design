package recursion;

//Question :

/*Given a "4 X n " board and tiles of size "4 X 1",
 count the number of ways to tile the given board using the "4 X 1" tiles */

//Answer :

/* A tile can either be placed horizontally
 i.e as a 4 X 1 or vertically 1 X 4
 */

// Input : N
// Output : Number of ways

import java.util.Scanner;

public class TilingProblem {

    public static int ways(int n){

        //Base case
        // n =0 0 ways
        // n =1 1 ways
        // n =2 1 ways
        // n =3 1 ways
        // n =4 2 ways
        if( n <=3 ){
            return 1;
        }
        //rec case f(n) = f(n-1) + f(n-4)
        int w = ways(n-1) + ways(n-4);
        return w;
    }
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        System.out.println("No of ways : "+ ways(n));
    }
}
