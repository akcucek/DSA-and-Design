package recursion.genric;

import java.util.Scanner;

//Find Last Index in Array
public class LinearSearch2 {

    public static int search(int arr[], int tar, int index){
        //base condition
        if( index < 0){
            return index +1;
        }
        //rec case
        if( arr[index] == tar){
            return index +1;
        }else{
            return search(arr, tar, index -1);
        }

    }
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int arr[] = new int[]{14,7,7,5,6,25,66,7};
        int tar = scan.nextInt();

        System.out.println(search(arr,tar,arr.length -1));
    }
}
