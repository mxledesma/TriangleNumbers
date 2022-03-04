public class Bubblesort {
/*
    Bubble Sort is the simplest sorting algorithm that works by repeatedly swapping the adjacent elements if they are in wrong order.
            Example:
    First Pass:
            ( 5 1 4 2 8 ) –> ( 1 5 4 2 8 ), Here, algorithm compares the first two elements, and swaps since 5 > 1.
            ( 1 5 4 2 8 ) –>  ( 1 4 5 2 8 ), Swap since 5 > 4
            ( 1 4 5 2 8 ) –>  ( 1 4 2 5 8 ), Swap since 5 > 2
            ( 1 4 2 5 8 ) –> ( 1 4 2 5 8 ), Now, since these elements are already in order (8 > 5), algorithm does not swap them.
    Second Pass:
            ( 1 4 2 5 8 ) –> ( 1 4 2 5 8 )
            ( 1 4 2 5 8 ) –> ( 1 2 4 5 8 ), Swap since 4 > 2
            ( 1 2 4 5 8 ) –> ( 1 2 4 5 8 )
            ( 1 2 4 5 8 ) –>  ( 1 2 4 5 8 )
    Now, the array is already sorted, but our algorithm does not know if it is completed. The algorithm needs one whole pass without any swap to know it is sorted.
    Third Pass:
            ( 1 2 4 5 8 ) –> ( 1 2 4 5 8 )
            ( 1 2 4 5 8 ) –> ( 1 2 4 5 8 )
            ( 1 2 4 5 8 ) –> ( 1 2 4 5 8 )
            ( 1 2 4 5 8 ) –> ( 1 2 4 5 8 )
*/
    public static void bubblesort(int[] arr){
        int temp = 0;
        int len = arr.length;   // .length are for arrays

        for(int i = 0; i<len; i++){  // ex. arr= {5,8,1,6,9,2} arr.length=6 # of runs i = 5 runs b/c i<len
                for(int j=0; j<len-1-i; j++) {  // j is the number of swap comparision  = 5 , at begining of j for loop, 6-1-0 = 5, arr.len - 1 - i =0
                                                // at the end of j for loop, j < 6-1-5 = 0 so no out of bounds  i will go one less than six beuase  i<len
                                                // j goes from j = 0 to j= 6-1-5 =0
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


        // i will be the number of runs which is 7 runs , 7 elements
   //     for(int i=0; i<len; i++){   // len is the number elements in an array
   //         for(int j=1; j < (len-i); j++){   //int j=1;  starts to see the second element
                                              // j<(len-i) shrinks to zero  because it starts from the lenght of array to end of i loop
     //           if(arr[j-1] > arr[j]) {   // if(arr[j-1] < arr[j])  you would do nothing
                    //swap elements
      //              temp = arr[j - 1];
      //              arr[j - 1] = arr[j];
      //              arr[j] = temp;
        //        }
  //          }

      //  }


    }

    public static void main(String[] args){

        int arr[] ={3,60,35,2,45,320,5,7,899,3999};

        System.out.println("Array Before Bubble Sort");
        for(int i=0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        bubblesort(arr);
        System.out.print("\n");
        for(int i=0; i < arr.length; i++){

            System.out.print(arr[i] + " ");
        }



        //  bubbleSort(arr);//sorting array elements using bubble sort

    }


}
