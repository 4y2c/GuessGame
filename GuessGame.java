
/**
 * Write a description of class GuessGame here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
import java.lang.Math;
public class GuessGame{
    public static void main(){
        //Create the stuff for the game
        int randomNumber = (int)(Math.random()*10) + 1;
        Scanner scanner = new Scanner(System.in);
        int tries = 0;

        //Greet the user and ask for input
        System.out.println("Welcome to GuessGame!!!");
        while (tries < 5){
            System.out.println("Guess a number between 1 and 10.");
            int guess = scanner.nextInt();

            if (guess == randomNumber){
                System.out.println("Correct");
                System.out.println("You win!");
                tries = 10;
            }else if (guess < randomNumber){
                System.out.println("Guess higher");
                tries++;
            }else {
                System.out.println("Guess lower");
                tries++;
            }
        }
        if (tries == 5){
            System.out.println("You lose");
        }
    }
}
