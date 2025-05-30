package recursion.sort;

//Check Array is sorted or not using recursion
public class SortedArray {

    public static boolean isSorted(int arr[], int i,int len){
      //base condition
      //if size of the array is zero or one
      if(len ==0 || len ==1){
          return true;
      }
      //rec case
      if( arr[i] < arr[i+1] && isSorted(arr,i+1,len-1)){
          return true;
      }else{
          return false;
      }

    }

    public static void main(String[] args) {

        int arr[] = new int[]{3,6,2,5};
        int len = arr.length;

        System.out.println(isSorted(arr,0,len));
    }

}
