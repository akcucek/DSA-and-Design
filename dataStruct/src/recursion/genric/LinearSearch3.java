package recursion.genric;

import java.util.ArrayList;
import java.util.Scanner;

public class LinearSearch3 {

    static ArrayList<Integer> list= new ArrayList<Integer>();

    public static void search(int arr[], int tar, int index) {
        //base condition
        if ( arr.length <= index) {
            return ;
        }
        //rec case
        if (arr[index] == tar) {
            list.add(index);
        }
        search(arr, tar, index + 1);

    }
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int arr[] = new int[]{14,7,7,5,6,25,66,7};
        int tar = scan.nextInt();

        search(arr,tar,0);
        System.out.println(list);
    }
}
