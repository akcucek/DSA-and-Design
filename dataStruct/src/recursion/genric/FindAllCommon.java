package recursion.genric;

import java.util.ArrayList;
import java.util.Scanner;

public class FindAllCommon {

   public static ArrayList<Integer> findAll(int arr[], int tar, int index, ArrayList<Integer> list){

       //base condition
       if( arr.length <= index){
           return list;
       }
       //rec case
       if( arr[index] == tar){
           list.add(arr[index]);
       }
       return findAll(arr,tar,index+1, list);
   }
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int arr[]= new int[]{ 3,45,6,7,7,6,9};
        int tar = scan.nextInt();

        System.out.println(findAll(arr, tar, 0, new ArrayList<>()));
    }
}
