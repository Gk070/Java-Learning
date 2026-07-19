import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // ROCK PAPER SCISSOR GAME
        System.out.println("ROCK PAPER SCISSOR GAME (🗿, 📃, ✂️)");
        System.out.println("-------------------------------------");

        // Declare variables
        String[] choices = {"rock", "paper", "scissor"};
        String playerChoice;
        String computerChoice;
        String playAgain = "yes";

        do {
            // Get choice from the user
            System.out.println();
            System.out.print("Enter your move (rock, paper, scissor): ");
            playerChoice = scanner.nextLine().toLowerCase();

            if (!playerChoice.equals("rock") && !playerChoice.equals("paper") && !playerChoice.equals("scissor")) {
                System.out.println("Invalid choice");
                continue;
            }
            // Get random choice from the computer
            computerChoice = choices[random.nextInt(3)];
            System.out.println("Computer choice: " + computerChoice);

            // Check win condition
            if (playerChoice.equals(computerChoice)) {
                System.out.println("It is a tie! 😀");
            } else if ((playerChoice.equals("rock") && computerChoice.equals("scissor")) ||
                    (playerChoice.equals("paper") && computerChoice.equals("rock")) ||
                    (playerChoice.equals("scissor") && computerChoice.equals("paper"))) {
                System.out.println("You win! 🥳");
            } else {
                System.out.println("Computer win! 😭");
            }

            // Ask to play again
            System.out.println();
            System.out.print("Play again (yes/no): ");
            playAgain = scanner.nextLine().toLowerCase();
        } while (playAgain.equals("yes"));

        // Goodbye message
        System.out.println("Thanks for playing!😶‍🌫️");

        scanner.close();
    }
}
