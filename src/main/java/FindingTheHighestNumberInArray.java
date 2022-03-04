import java.util.Arrays;

public class FindingTheHighestNumberInArray {


    public static void main(String[] args){

        int[] arr = {90,5,9,109,67,85,98,990};

        // Find the highest number of an array

        int max = arr[0];
        for(int i = 1; i< arr.length; i++){

            if(max<arr[i]){
                max = arr[i];
            }

        }
        System.out.print("Highest number: "+max+"\n");

        // Place the array in a bubble sort or ascending order
        // int[] arr = {90,5,9,109,67};


        int temp = 0;
      //  int max2 = arr[arr.length-1];
 // Ascending order of an Array

        for(int i = 0; i<arr.length; i++){  // ex. arr= {5,8,1,6,9,2} arr.length=6 # of runs i = 5 runs b/c i<len
            for(int j=0; j<arr.length-1-i; j++) {  // j is the number of swap comparision  = 5 , at begining of j for loop, 6-1-0 = 5, arr.len - 1 - i =0
                // at the end of j for loop, j < 6-1-5 = 0 so no out of bounds  i will go one less than six beuase  i<len
                // j starts j = 0 , 1 , 2, 3, 4, 5 to j= 6-1-0 =5
                // j ends at j = 5
                if(arr[j]>arr[j+1]) {
                    //      temp = arr[j];  // This is swap. THIS DOES WORK
                    //   arr[j] = arr[j+1];
                    //  arr[j+1] = temp;

                    temp = arr[j+1];    // THIS ONE WORKS TOO
                    arr[j+1] = arr[j];
                    arr[j]=temp;
                }
            }
        }

        System.out.print("Array ascending order: "+ Arrays.toString(arr));  // prints out an array in a string.

        /*
        0 1
0 2
0 3
0 4
0 5
0 6
0 7
1 0
1 1
1 2
1 3
1 4
1 5
1 6
2 0
2 1
2 2
2 3
2 4
2 5
3 0
3 1
3 2
3 3
3 4
4 0
4 1
4 2
4 3
5 0
5 1
5 2
6 0
6 1
7 0
         */

// Descending order of an array
        for(int i = 0; i<arr.length; i++){  // ex. arr= {5,8,1,6,9,2} arr.length=6 # of runs i = 5 runs b/c i<len
            for(int j=0; j<arr.length-1-i; j++) {  // j is the number of swap comparision  = 5 , at begining of j for loop, 6-1-0 = 5, arr.len - 1 - i =0
                // at the end of j for loop, j < 6-1-5 = 0 so no out of bounds  i will go one less than six beuase  i<len
                // j starts j = 0 , 1 , 2, 3, 4, 5 to j= 6-1-0 =5
                // j ends at j = 5
                if(arr[j]<arr[j+1]) {
                    //      temp = arr[j];  // This is swap. THIS DOES WORK
                    //   arr[j] = arr[j+1];
                    //  arr[j+1] = temp;

                    temp = arr[j+1];    // THIS ONE WORKS TOO
                    arr[j+1] = arr[j];
                    arr[j]=temp;
                }
            }
        }

        System.out.print("\n"+"Array Descending order: "+ Arrays.toString(arr));  // prints out an array in a string.



        // Descending order
        // arr= {5,8,1,6,9,2}
/*
        for(int i = arr.length-1; i>=0; i--){

            for(int j= i-1; j>= 0; j--){

                System.out.print(i+" "+j+"\n");
            }
        }    */

    }
}
