import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.Random;

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

//        int age = 30;
        int year = 2026;
        int quantity = 1;
        System.out.println("The year is " + year);
        System.out.println("The year is " + "year");

//        double price = 19999.99;
        double gpa = 3;
        double temperature = -12.5;
//        System.out.println("$" + price);
        System.out.println(gpa);

        char grade = 'A';
        char symbol = '!';
        char currency = '$';
        System.out.println(grade);

//        boolean isStudent = true;
        boolean forSale = false;
        boolean isOnline = true;
//        System.out.println(isStudent);

//        String name = "Geethul Krishna G D";
        String food = "Mandi";
//        String email = "fake@gmail.com";
        String car = "Mustang";
        String color = "Red";
//        System.out.println("Hello " + name);
//
//        System.out.println("Hello " + name);
//        System.out.println("You are " + age + " years old");
        System.out.println("Your gpa is : " + gpa);
        System.out.println("Your average letter grade is : " + grade);
        System.out.println("Your choice is a " + color + " " + year + " " + car);
//        System.out.println("The price is : " + currency + price);

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
//        double result = 3 + 4 * (7 - 5) / 2.0;
        /*
         Order
         -----
         3 + 4 * 2 / 2.0
         3 + 8 / 2.0
         3 + 4.0
         7.0
//         */
//        System.out.println(result);

        // if statement = performs a block of code if its condition is true
        int myAge = 15;

        if(myAge >= 18){
            System.out.println("You are an adult!");
        } else if (myAge < 0) {
            System.out.println("You haven't born yet");
        } else{
            System.out.println("You are a child");
        }

        // Random Numbers
        Random random = new Random();
        int number1;
        int number2;
        double num;
        boolean isHeads;

        number1 = random.nextInt(1, 7);
        System.out.println(number1);

        number2 = random.nextInt(1, 7);
        System.out.println(number2);

        num = random.nextDouble();
        System.out.println(num);

        isHeads = random.nextBoolean();
        System.out.println(isHeads);

        // Math
        System.out.println(Math.PI);
        System.out.println(Math.E);

        double results;

        results = Math.pow(2, 3);
        results = Math.abs(-5);
        results = Math.sqrt(9);
        results = Math.round(3.14);
        results = Math.ceil(3.14);
        results = Math.floor(3.14);
        results = Math.max(10, 20);
        results = Math.min(10, 20);
        System.out.println(results);

//        // Finding Hypotenuse of a Triangle
//        Scanner scanner = new Scanner(System.in);
//        double base;
//        double altitude;
//        double hypotenuse;
//
//        System.out.print("Enter the length of base: ");
//        base = scanner.nextDouble();
//
//        System.out.print("Enter the length of altitude: ");
//        altitude = scanner.nextDouble();
//
//        hypotenuse = Math.sqrt(Math.pow(base, 2) + Math.pow(altitude, 2));
//        System.out.println("Hypotenuse is : " + hypotenuse + "cm");
//
//        scanner.close();

        // Finding Circumference, Area and Volume
//        Scanner scanner = new Scanner(System.in);
//
//        double radius;
//        System.out.print("Enter radius: ");
//        radius = scanner.nextDouble();
//
//        double circumference;
//        circumference = 2 * Math.PI * radius;
//        System.out.println("Circumference is " + circumference + "cm");
//
//        double area;
//        area = Math.PI * Math.pow(radius, 2);
//        System.out.println("Area is " + area + "cm²");
//
//        double volume;
//        volume = (4 / 3.0) * Math.PI * Math.pow(radius, 3);
//        System.out.println("Volume is " + volume + "cm³");
//
//        scanner.close();

        // printf() = is a method used to format output
        // %[flags][width][.precision][specifier-character]

        String myName = "Batman";
        char firstLetter = 'B';
        int myage = 21;
        double height = 177;
        boolean isEmployed = false;
        double myPrice = 151404;
        double negativeNumber = -2;

        System.out.printf("Hello %s\n", myName);
        System.out.printf("Your name starts with a %c\n", firstLetter);
        System.out.printf("You are %d years old\n", myage);
        System.out.printf("You are %.1f cms tall\n", height);
        System.out.printf("Employed: %b\n", isEmployed);

        System.out.printf("%s is %d years old", myName, myage);

        // [flags]
        // + = output a plus
        // , = comma grouping separator
        // ( = negative numbers are enclosed in ()
        // space = display a minus if negative, space if positive
        System.out.printf("You are %+.1f cms tall\n", height);
        System.out.printf("You are %,.1f cms tall\n", myPrice);
        System.out.printf("You are %(.1f cms tall\n", negativeNumber);
        System.out.printf("You are % .1f cms tall\n", negativeNumber);
        System.out.printf("You are % .1f cms tall\n", height);

        // [width]
        // 0 = zero padding
        // number = right justified padding
        // negative number = left justified padding

        int number = 1;

        System.out.printf("%04d\n", number);
        System.out.printf("%4d\n", number);
        System.out.printf("%-4d\n", number);

        // Nested if
        boolean isStudent = true;
        boolean isSenior = true;
        double price = 9.99;

        if(isStudent){
            if(isSenior){
                System.out.println("You get a senior discount of 20%");
                System.out.println("You get a student discount of 10%");
                price *= 0.7;
            }else {
                System.out.println("You get a student discount of 10%");
                price *= 0.9;
            }
        }else{
            if(isSenior){
                System.out.println("You get a senior discount of 20%");
                price *= 0.8;
            }
            else{
                price *= 1;
            }
        }
        System.out.printf("The price of a ticket is: ₹%.2f\n", price);

        // String Methods
//        String name = "  Hari Kumar  ";
//
//        int length = name.length();
//        char letter = name.charAt(0);
//        int index = name.indexOf("a");
//        int lastIndex = name.lastIndexOf("a");
//        name = name.toUpperCase();
//        name = name.toLowerCase();
//        name = name.trim();
//        name = name.replace('a', 'o');
//        System.out.println(name);
//        System.out.println(name.isEmpty());
//        System.out.println(name.contains("o"));
//        System.out.println(name.equals("password"));
//        System.out.println(name.equalsIgnoreCase("hori kumor"));

        // .substring() = A method used to extract a portion of a string
        //                .substring(start, end)

        String email = "hari123@gmail.com";
        String username = email.substring(0,email.indexOf("@"));
        String domain = email.substring(email.indexOf("@") + 1);
        System.out.println(domain);

        // ternary operator ? = Return 1 of 2 values if a condition is true
        // variable = (condition) ? ifTrue : ifFalse;

        int score = 70;
        String passOrFail = (score >= 60) ? "Pass" : "Fail";
        System.out.println(passOrFail);

        // Enhanced switch = A replacement to many else if statements
        //                   (Java14 feature)

        String day = "Monday";
        switch (day){
            case "Monday" -> System.out.println("It is a weekday");
            case "Tuesday" -> System.out.println("It is a weekday");
            case "Wednesday" -> System.out.println("It is s weekday");
            case "Thursday" -> System.out.println("It is a weekday");
            case "Friday" -> System.out.println("It is a weekday");
            case "Saturday", "Sunday" -> System.out.println("It is the weekend");
            default -> System.out.println(day + " is not a day");
        }

        // Logical Operators
        // && = AND
        // || = OR
        // ! = NOT

        double temp = -20;
        boolean isSunny = false;

        if (temp <= 30 && temp >= 0 && isSunny) {
            System.out.println("The weather is good");
        } else if (temp <= 30 && temp >= 0 && !isSunny) {
            System.out.println("The weather is cloudy");
        } else if (temp <= 30 || temp >= 0 || isSunny) {
            System.out.println("The weather is bad");
        }

        // while loop = repeat some code forever
        //              while some condition remains true
//
//        Scanner scanner = new Scanner(System.in);
//
//        String name = "";
//
//        while (name.isEmpty()) {
//            System.out.print("Enter your name: ");
//            name = scanner.nextLine();
//        }
//
//        System.out.println("Hello " + name);
//
//        scanner.close();

        // Infinite loop Example

//        while (1 == 1) {
//            System.out.println("This is an infinite loop");
//        }

        // do-while loop
//
//        Scanner scanner = new Scanner(System.in);
//
//        int age = 0;
//
//        do {
//            System.out.println("Your age can't be negative");
//            System.out.print("Enter your age: ");
//            age = scanner.nextInt();
//        } while (age < 0);
//
//        System.out.println("You are " + age + " years old");
//
//        scanner.close();


        // for loop = execute some code a certain amount of times
        // for (initialization; exit condition; step)

        for (int i = 0; i < 10; i++){
            System.out.println(i);
        }

        // break = break out of a loop (STOP)
        // continue = skip current iteration of a loop (SKIP)

        for (int i = 0; i < 10; i++) {

            if (i == 5) {
                break;
            } else if (i == 3) {
                continue;
            }
            System.out.println(i);
        }

        // Nested loop = A loop inside another loop
        //               Used often with matrices or DSA

        for (int j = 1; j <=3; j++) {
            for (int i = 1; i <= 9; i++){
                System.out.print(i + " ");
            }
            System.out.println();
        }

        // method = a block of reusable code that is executed when called ()

        String name = "Hari";
        int age = 25;
        happyBirthday(name);

        double result = square(3);
        System.out.println(result);

    }

    static void happyBirthday (String name) {
        System.out.println("Happy Birthday to you!");
        System.out.println(("Happy Birthday to you!"));
        System.out.printf("Happy Birthday Dear %s!\n", name);
        System.out.println("Happy Birthday to you!");
    }

    static double square(double number) {
        return number * number;
    }

}
