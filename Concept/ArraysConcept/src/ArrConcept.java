import java.sql.SQLOutput;
import java.util.Arrays;

public class ArrConcept {
    public static void main(String[] args) {

        //To fill all value in Arrays
        boolean arr[] = new boolean[5]; // Here Value is initially is false

        System.out.println(arr[0]);
        Arrays.fill(arr,true);
        System.out.println(arr[0]);

        //--------OR----------------
        for(int i= 0; i < arr.length; i++){
            arr[i] = false;
        }
        System.out.println(arr[1]);


        //To Value in 2D in Arrays
        boolean matrix[][] = new boolean[5][5]; // value is false initially

        for(boolean[] row: matrix){
            Arrays.fill(row, true);
        }
        System.out.println(matrix[0][1]);

        //-------------OR-----------------
        for(int i=0; i < matrix.length; i++){
            Arrays.fill(matrix[i], false);
        }
    }
}
