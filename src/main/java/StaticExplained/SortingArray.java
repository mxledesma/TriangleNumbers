package StaticExplained;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortingArray {

    public static void main(String[] args){

        Integer arr[] = {10,20,20,30,30,40,50,50,10};

        Arrays.sort(arr);    // YOU CAN SORT AN ARRAY
        reverse(arr);

      //  List<Integer> arr2 = new ArrayList<>(Arrays.asList(arr));

        // Wont work for int array primitive NEEDS to say Integer
        List<Integer> listArray = Arrays.asList(arr);

        Collections.sort(listArray);


        for(int a: arr){
            System.out.print(a+" ");
        }

    }

    private static void reverse(Integer[] arr) {

        // do later
    }
}
