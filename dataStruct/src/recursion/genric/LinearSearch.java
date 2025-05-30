package recursion.genric;

import java.util.Scanner;

public class LinearSearch {

    public static int search(int arr[], int tar, int index){
        //base condition
        if( arr.length <= index){
            System.out.print("Not Found : ");
            return -1;
        }
        //rec case f(n) = f(n-1) + 1
        if( arr[index] == tar){
            System.out.print("Found :");
            return index +1 ;
        }else{
            return search(arr, tar, index+1);
        }
    }
    public static boolean search2(int arr[], int tar, int index){
        //base condition
        if( arr.length <= index){
            return false;
        }
        //rec case
        return arr[index] == tar || search2(arr, tar, index+1);

    }
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int arr[] = new int[]{14,5,6,25,66,7};
        int tar = scan.nextInt();

        System.out.println(search(arr,tar,0));
        System.out.println(search2(arr,tar,0));
    }
}
