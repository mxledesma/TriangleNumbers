import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;



public class RockPaperScissor {

    public static void main(String[] args) {

        while (true) {

            System.out.print("Please enter integer value of 3: ");
            Scanner sc = new Scanner(System.in);
            int l = sc.nextInt();  // Enter an integer of length. 3 for r, p s

            //  String[] rps = new String[l];  an array with l elements
            List<String> rps = new ArrayList(l);  // 3 elements

            String letter;
            for (int i = 0; i <= l - 1; i++) {
                System.out.print("ComputerMove enter character of r, p, s only: ");
                letter = sc.next();
                rps.add(letter);    // ArraylIst do not use nextLine() but just next()
                //   rps[i] = sc.next();  // this is how to do it as an array

            }

            for (String element : rps) {  // printout of Array list rps
                System.out.println(element);
            }

            // If it was an rps array
            // String computerMove = rps[new Random().nextInt(rps.length)];  // for an array
            String computerMove = rps.get(new Random().nextInt(rps.size()));  // for an arraylist

            System.out.print("Computermove " + computerMove);
            System.out.print("\n");

            String playerMove = "";

            sc.reset();

            while (true) {

                System.out.println("PlayerMove. Please enter your move (r, p, s) ");
                playerMove = sc.nextLine();
                if (playerMove.equals("r") || playerMove.equals("s") || playerMove.equals("p")) {   // To compare strings, characters dont use != or ==

                    break;

                }
                System.out.println("Wrong input of characters");
            }

            System.out.println("Computer played " + computerMove);

            if (computerMove.equals(playerMove)) {
                System.out.print("Rock paper scissor was a tie!!");
            } else if (playerMove.equals("r")) {
                if (computerMove.equals("p")) {
                    System.out.print("You lose paper > rock.");
                } else if (computerMove.equals("s")) {
                    System.out.print("You win rock  > scissor.");
                }
            } else if (playerMove.equals("p")) {
                if (computerMove.equals("r")) {
                    System.out.print("You win paper > rock.");
                } else if (computerMove.equals("s")) {
                    System.out.print("You lose scissor  > paper.");
                }
            } else if (playerMove.equals("s")) {
                if (computerMove.equals("r")) {
                    System.out.print("You lose rock > scissor.");
                } else if (computerMove.equals("p")) {
                    System.out.print("You win scissor  > paper.");
                }
            }

            System.out.println("Do you want to play again. y/n? ");
            String playAgain = sc.nextLine();
            if(!playAgain.equals("y")){
                break;
            }

        }




    }

}
