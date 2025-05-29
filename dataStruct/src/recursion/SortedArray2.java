package recursion;

public class SortedArray2 {

    public static boolean isSorted(int arr[], int index){

        //Base Condition
        if( (arr.length -1) == index){
            return true;
        }
        if( arr[index] > arr[index+1]){
            return false;
        }
        //recursive case

        return isSorted(arr,index+1);
    }
    public static void main(String[] args) {

        int arr[]= new int[]{4,7,8,1};
        int krr[]= new int[]{89,109,1011};
        int mrr[]= new int[]{1};

        System.out.println(isSorted(arr,0));
        System.out.println(isSorted(krr,0));
        System.out.println(isSorted(mrr,0));
    }
}
