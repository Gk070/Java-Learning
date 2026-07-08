import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        // Temprature Converter

        Scanner scanner = new Scanner(System.in);

        // Declare variables
        double temp;
        double newTemp;
        String unit;

        System.out.println("Temprature Coverter 🌡️");
        System.out.println("----------------------");

        // Taking user input
        System.out.print("Enter the temprature: ");
        temp = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Convert to celsius or fahrenheit? (C or F): ");
        unit = scanner.next().toUpperCase();

        newTemp = (unit.equals("C")) ? ((temp - 32) * (5 / 9.0)) : ((temp * (9 / 5.0)) + 32);
        System.out.printf("%.2f°%s", newTemp, unit);

        scanner.close();
    }
}
