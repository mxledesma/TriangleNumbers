public class CheckingOnAStringDuplicate {

    // Check for duplicates and place in a new array
    // and give # of duplicates.

    public static void main(String[] args){


        // Continue with this on duplicates on an array of numbers

        String str = "abcdb";   // length of 5 , now it would be a length of 4

        char[] ch = str.toCharArray();

        char  y = ' ';
        String str2 = "";
        int count = 0;

        for(int i=0; i<str.length()-1; i++){  // 0 -> 5-1 = 4  now 3
            y = ch[i];      // convert a charcter to a string
            for(int j=1; j<str.length()-1; j++){

                if(y == ch[j+1]) {

                    count = count + 1;

                }else{
                    str2 = str2 + String.valueOf(ch[i]);
                }


            }





        }
        System.out.print(str2);



    }
}
