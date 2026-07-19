import java.util.Scanner;

public class Main {
    public static void main (String[] args){

        Scanner scanner = new Scanner(System.in);

        // JAVA QUIZ GAME

        // Questions array
        String[] questions = {"What is the tallest mountain in the world?",
                              "Which is the only planet in our solar system that spins clockwise?",
                              "Which river flows through the city of Paris?",
                              "Who painted the famous artwork The Starry Night?",
                              "How many strings does a standard violin have?"};

        // Options array
        String[][] options = {{"A) K2", "B) Mount Everest", "C) Mount Kilimanjaro", "D) Kangchenjunga"},
                              {"A) Mars", "B) Venus", "C) Jupiter", "D) Mercury"},
                              {"A) The Thames", "B) The Rhine", "C) The Seine", "D) The Danube"},
                              {"A) Leonardo da Vinci", "B) Claude Monet", "C) Pablo Picasso", "D) Vincent van Gogh"},
                              {"A) 4", "B) 5", "C) 6", "D) 8"}};

        // Declare variables
        char[] answers = {'B', 'B', 'C', 'D', 'A'};
        int score = 0;
        char guess;

        // Welcome message
        System.out.println("Quiz Game");
        System.out.println("---------");

        // Question list
        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);

            // Options list
            for (String option : options[i]) {
                System.out.println(option);
            }

            // Get guess from user
            System.out.println();
            System.out.print("Enter your answer: ");
            guess = scanner.next().charAt(0);

            // Check our guess
            if (guess == answers[i]) {
                System.out.println("Correct! ✅");
                score ++;
            } else {
                System.out.println("Incorrect! ❌");
            }
            System.out.println();

        }

        // Display final score
        System.out.println("Your final score is: " + score + " out of " + questions.length + "🥳");

        scanner.close();
    }
}