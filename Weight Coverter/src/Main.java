import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        // Weight Conversion Code
        Scanner scanner = new Scanner(System.in);

        // Declare variables
        double weight;
        double newWeight;
        int choice;

        // Welcome message
        System.out.println("Weight Conversion Program ⚖️");
        System.out.println("----------------------------");
        System.out.println("1: Convert lbs to kgs");
        System.out.println("2: Convert kgs to lbs");

        // Prompt for user choice
        System.out.print("Choose an option: ");
        choice = scanner.nextInt();

        // Option 1 - convert lbs to kgs
        // Option 2 - covert kgs to lbs
        // Else print not a valid choice
        if (choice == 1){
            System.out.print("Enter the weight in lbs: ");
            newWeight = scanner.nextDouble();
            newWeight *= 0.453592;
            System.out.printf("The new weight in kgs is: %.2f kgs\n", newWeight);
        } else if (choice == 2) {
            System.out.print("Enter the weight in kgs: ");
            newWeight = scanner.nextDouble();
            newWeight *= 2.20462;
            System.out.printf("The new weight in lbs is: %.2f lbs\n", newWeight);
        } else {
            System.out.println("Not a valid option");
        }

        scanner.close();
    }
}
