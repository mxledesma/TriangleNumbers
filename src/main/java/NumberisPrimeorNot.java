import java.util.Scanner;

public class NumberisPrimeorNot {


    public static void main(String[] args) {

        System.out.print("Enter a number above 2: ");
        Scanner sc = new Scanner(System.in);
        int numberToCheck = sc.nextInt();


        int remainder = 0;

        boolean isPrime = true;
        // This will divide the number by 2

        for(int i = 2;i<(numberToCheck);i++){   // you have to start at 2 NOT 1

       /*      remainder = numberToCheck%i;

             if(remainder == 0) {

                 isPrime = false;   // It hit it to be isPrime false
                 break;           // you dont need break
             }   */

            if(numberToCheck%i==0){    // Works too shortened did not use remainder
                isPrime = false;
            }


        }
        // When you get out of the for loop you check isPrime
        if(isPrime){  // Note, isPrime is already a boolean true or false
            System.out.print("This is  a prime number: "+numberToCheck);   // isPrime is TRUE
        }else{
            System.out.print("This is not a prime number: "+numberToCheck);  // IsPrime is FALSE
        }


    }

}