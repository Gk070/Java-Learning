import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        // This is my first java program
        /*
            This
            is
            a
            multi-line
            comment
         */
        System.out.print("I like pizza!\n");
        System.out.println("It's really good!");
        System.out.println("Buy me pizza!");
        System.out.println();

        // Variable - a reusable container for a value
        //            a variable behaves as if it was the value it contains

        // Primitive - simple value stored directly in memory (stack)
        // Reference = memory address(stack) that points to the (heap)

        // Primitive vs References
        // ---------    ----------
        // int          string
        // double       array
        // char         object
        // boolean
        // float
        // byte
        // short
        // long
        // void

        // 2 Steps to creating a variable
        // ------------------------------
        // 1. declaration
        // 2. assignment

        int age = 30;
        int year = 2026;
        int quantity = 1;
        System.out.println("The year is " + year);
        System.out.println("The year is " + "year");

        double price = 19999.99;
        double gpa = 3;
        double temperature = -12.5;
        System.out.println("$" + price);
        System.out.println(gpa);

        char grade = 'A';
        char symbol = '!';
        char currency = '$';
        System.out.println(grade);

        boolean isStudent = true;
        boolean forSale = false;
        boolean isOnline = true;
        System.out.println(isStudent);

        String name = "Geethul Krishna G D";
        String food = "Mandi";
        String email = "fake@gmail.com";
        String car = "Mustang";
        String color = "Red";
        System.out.println("Hello " + name);

        System.out.println("Hello " + name);
        System.out.println("You are " + age + " years old");
        System.out.println("Your gpa is : " + gpa);
        System.out.println("Your average letter grade is : " + grade);
        System.out.println("Your choice is a " + color + " " + year + " " + car);
        System.out.println("The price is : " + currency + price);

//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter your name : ");
//        String myName = scanner.nextLine();
//        System.out.println("Hello " + myName);
//
//        System.out.print("Enter your age: ");
//        int myAge = scanner.nextInt();
//        System.out.println("You are " + myAge + " years old");
//
//        System.out.print("What is gpa: ");
//        double myGpa = scanner.nextDouble();
//        System.out.println("Your gpa is: " + myGpa);
//
//        System.out.println("Are you a student? (true/false): ");
//        boolean isMyStudent = scanner.nextBoolean();
//        System.out.println("Student: " + isMyStudent);
//
//        scanner.close();

        // Calculate area of a rectangle
//        Scanner scanner1 = new Scanner(System.in);
//        System.out.print("Enter length: ");
//        double length = scanner1.nextDouble();
//
//        System.out.print("Enter breadth: ");
//        double breadth = scanner1.nextDouble();
//
//        double area = length * breadth;
//
//        System.out.println("Area is : " + area + "cm²");
//        scanner1.close();

        // Arithmetic Operators

        int x = 10;
        int y = 2;
        int z;

        z = x + y;
        z = x - y;
        z = x * y;
        z = x / y;
        z = x % y;
        System.out.println(z);

        // Augmented Assignment Operators
        int a = 10;
        int b = 3;

        a += b;
        a -= b;
        a *= b;
        a /= b;
        a %= b;
        System.out.println(a);

        // Increment and Decrement Operator
        int c = 1;

        c++;
        c--;
        System.out.println(c);

        // Order of Operations [P-E-M-D-A-S]
        double result = 3 + 4 * (7 - 5) / 2.0;
        /*
         Order
         -----
         3 + 4 * 2 / 2.0
         3 + 8 / 2.0
         3 + 4.0
         7.0
         */
        System.out.println(result);
    }
}
