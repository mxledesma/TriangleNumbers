import java.io.*;
import java.util.*;

public class Solution {

    public static void getResult(String word)
    {
        String y = "";   // primitive
        int l = word.length();   // .length() method are for strings
                                 // .length is for arrays

        for(int k = l - 1; k >= 0; k--){  // A primitive string y is not mutable you can change it or add to it
            y = y + word.charAt(k);
            System.out.println("y: "+y);
        }

        System.out.print("y length"+y.length());

        String yString = new String(y);  // Convert from primitive string to string object

        System.out.print("\n");

        System.out.print("yString"+yString);

     //   String[] wordArray = new String[l];  i dont really need the arraylist
        List<Character> arrayListWord= new ArrayList<>(l);

       for(Character w: word.toCharArray()){  // i just did it to place each character in the array
            arrayListWord.add(w);
        }

       char[] ch = word.toCharArray();   // place each character in a ch character[] array


// this works too   if(word.equalsIgnoreCase(yString)){
        if(word.equalsIgnoreCase(y)){  // it accepts a primitive string or a wrapper String
            System.out.println("Yes, it is Palindrome.");
            System.out.println("Place the word in an array: "+arrayListWord);

        }
        else{
            System.out.println("No, it is not Palindrome.");
            System.out.println("Place the word in an array:"+arrayListWord);
        }


    }
    public static void main(String[] args) {

        System.out.println("This is palindrome which 'madam' is palindrome 'Hello' not. It is a word that " +
                        "can be reversed. Enter our word.");
        Scanner sc=new Scanner(System.in);
        String word =sc.next();
        /* Enter your code here. Print output to STDOUT. */

        getResult(word);
/*
        String y = "";
        int l = A.length();

        for(int k = l - 1; k >= 0; k--){
            y = y + A.charAt(k);
        }
        if(A.equalsIgnoreCase(y)){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
        */
    }

}