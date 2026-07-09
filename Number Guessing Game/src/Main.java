import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        // Number Guessing Game
        // For random number
        Random random = new Random();

        // Declare variables
        int guess;
        int actualNum;
        int attempts = 0;

        // Number to be guessed
        actualNum = random.nextInt(1, 101);

        // Welcome message
        System.out.println("Number Guessing Game 🔢");
        System.out.println("-----------------------");

        // Prompt user input
        System.out.println("Enter a number between 1-100");

        do {
            System.out.print("Enter a guess: ");
            guess = scanner.nextInt();
            attempts ++;

            if (guess < actualNum){
                System.out.println("Too Low! Try again 😶‍🌫️");
            } else if (guess > actualNum) {
                System.out.println("Too High! Try again 😶‍🌫️");
            } else {
                System.out.println("\nCorrect! The number was " + actualNum + " 🤩");
                System.out.println("Number of attemps: " + attempts);
            }
        } while (guess != actualNum);

        scanner.close();

    }
}
