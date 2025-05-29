package recursion;

import java.util.Scanner;

//Question:
/* Count the number of binary Strings with no consecutive
ones that can be formed using binary string of Length N
 */

//Input : N
//Output : Count of Strings

public class CountStrings {

    public static int count(int n){
        //base Condition
        //n = 0  o/p 0
        //n = 1 o/p  2
        //n =2  o/p 3
        if( n == 0  ){
            return 0;
        }
        if( n == 1){
            return 1;
        }
        int c = count(n-1) + count(n-2);

        return c;
    }
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextLine();

        System.out.println(" Number of count : "+ count(n));
    }
}
