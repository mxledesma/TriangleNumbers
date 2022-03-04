public class SumofHighestCombination {


    public static void main(String[]  args) {

        int[] testArrayA = {7, 6, 22, 5, 11};
        int[] testArrayB = {3, 12, 16, 5, 13};
        String res = "";
        int maxSum = 0;
        for (int i = 0; i < testArrayA.length; i++) {  // outer array  i will go from  0 -> 4 . the length of one of the arrays
            int A = testArrayA[i];
            for (int j = i; j < testArrayB.length; j++) {  // inner array  j will go from i to the length-1 of the second array
                int B = testArrayB[j];
                if (( B + A) > maxSum) {
                    maxSum = A + B;
                    res = A + " " + B;
                    if(maxSum > 30){  // Max Sum cannot exceed 30
                        maxSum = 0;
                    }
                }
            }
        }
        System.out.println(res + " "+maxSum);

    }
}
