import java.io.*;
import java.sql.Array;
import java.sql.SQLOutput;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Main {

//    static int x = 3; // Class scope

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
//        String food = "Mandi";
//        String email = "fake@gmail.com";
//        String car = "Mustang";
        String color = "Red";
//        System.out.println("Hello " + name);
//
//        System.out.println("Hello " + name);
//        System.out.println("You are " + age + " years old");
        System.out.println("Your gpa is : " + gpa);
        System.out.println("Your average letter grade is : " + grade);
//        System.out.println("Your choice is a " + color + " " + year + " " + car);
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

//        int x = 10;
//        int y = 2;
//        int z;
//
//        z = x + y;
//        z = x - y;
//        z = x * y;
//        z = x / y;
//        z = x % y;
//        System.out.println(z);

        // Augmented Assignment Operators
//        int a = 10;
//        int b = 3;
//
//        a += b;
//        a -= b;
//        a *= b;
//        a /= b;
//        a %= b;
//        System.out.println(a);

        // Increment and Decrement Operator
//        int c = 1;
//
//        c++;
//        c--;
//        System.out.println(c);

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
//        Random random = new Random();
//        int number1;
//        int number2;
//        double num;
//        boolean isHeads;
//
//        number1 = random.nextInt(1, 7);
//        System.out.println(number1);
//
//        number2 = random.nextInt(1, 7);
//        System.out.println(number2);
//
//        num = random.nextDouble();
//        System.out.println(num);
//
//        isHeads = random.nextBoolean();
//        System.out.println(isHeads);
//
//        // Math
//        System.out.println(Math.PI);
//        System.out.println(Math.E);
//
//        double results;
//
//        results = Math.pow(2, 3);
//        results = Math.abs(-5);
//        results = Math.sqrt(9);
//        results = Math.round(3.14);
//        results = Math.ceil(3.14);
//        results = Math.floor(3.14);
//        results = Math.max(10, 20);
//        results = Math.min(10, 20);
//        System.out.println(results);

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

//        int number = 1;
//
//        System.out.printf("%04d\n", number);
//        System.out.printf("%4d\n", number);
//        System.out.printf("%-4d\n", number);

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

//        String day = "Monday";
//        switch (day){
//            case "Monday" -> System.out.println("It is a weekday");
//            case "Tuesday" -> System.out.println("It is a weekday");
//            case "Wednesday" -> System.out.println("It is s weekday");
//            case "Thursday" -> System.out.println("It is a weekday");
//            case "Friday" -> System.out.println("It is a weekday");
//            case "Saturday", "Sunday" -> System.out.println("It is the weekend");
//            default -> System.out.println(day + " is not a day");
//        }

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

        // Overloaded methods = methods that share the same name,
        //                      but different parameters
        //                      signature = name + parameters
        System.out.println(add(1, 2));
        System.out.println(add(1, 2, 3));

        // Variable scope = where a variable can be accessed
//        int x = 1; // This is a local variable
//        System.out.println(x);

        doSomething();

        // Array = a collection of the same data type
        //         * think of it as a variable that can store more than 1 value *
//        String[] fruits = {"Apple", "Orange", "Banana", "Coconut"};
//        fruits[0] = "Pineapple";
//        int numOfFruits = fruits.length;
//        System.out.println(numOfFruits);
//        System.out.println(fruits[0]);
//
//        for (int i = 0; i < numOfFruits; i++){
//            System.out.println(fruits[i]);
//        }
//
//        // Enhanced for loop
//        for (String fruit : fruits) {
//            System.out.println(fruit);
//        }
//
//        Arrays.sort(fruits);
//        Arrays.fill(fruits, "Pineapple");
//        for (String fruit : fruits) {
//            System.out.println(fruit);
//        }

//        Scanner scanner = new Scanner(System.in);
//
//        // Enter user input to arrays
//        System.out.print("What number of inputs do you want?: ");
//        int size = scanner.nextInt();
//        scanner.nextLine();
//
//        String[] foods = new String[size];
//
//        for (int i = 0; i < foods.length; i++) {
//            System.out.print("Enter a food: ");
//            foods[i] = scanner.nextLine();
//        }
//
//        for (String food : foods) {
//            System.out.println(food);
//        }
//
//        scanner.close();

        int[] numbers = {10, 8, 22, 35, 46, 13};
        int target = 11;
        boolean isFound = false;

        for (int i = 0; i < numbers.length; i++) {
            if (target == numbers[i]) {
                System.out.println("Element found at index: " + i);
                isFound = true;
                break;
            }
        }

        if (!isFound) {
            System.out.println("Element not found in the array");
        }

        // varargs = allow a method to accept a varying number of arguments
        //           makes methods more flexible, no need for overloaded methods
        //           java will pack the arguments into an array
        //           ... (ellipsis)

        System.out.println(add(1, 2, 3, 4));

        // 2D array = An array where each element is an array
        //            Useful for storing a matrix of data

//        String[] fruits = {"Apple", "Banana", "Orange"};
//        String[] vegetables = {"Onion", "Tomato", "Beans"};
//        String[] meats = {"Chicken", "Mutton", "Beef"};
//
//        String[][] groceries = {fruits, vegetables, meats};
//
//        groceries[0][0] = "Cherry";
//        groceries[1][0] = "Brocoli";
//
//        for (String[] foods : groceries) {
//            for (String food : foods) {
//                System.out.print(food + " ");
//            }
//            System.out.println();
//        }

        // Object = An entity that holds data (attributes)
        //          and can perform actions (methods)
        //          It is a reference data type
//        Car car = new Car();
//        car.isRunning = true;
//        System.out.println(car.make);
//        System.out.println(car.model);
//        System.out.println(car.isRunning);
//        car.start();

        // constructor = A special method to initialize objects
        //               You can pass arguments to a constructor
        //               and set up initial values
//        Student student1 = new Student("Hari", 30, 5.6);
//        Student student2 = new Student("Joel", 15, 9.8);
//
//        System.out.println(student1.name);
//        student1.study();
//        System.out.println(student2.name);

        // Overloaded constructors = Allow a class to have multiple constructors
        //                           with different parameter lists.
        //                           Enable objects to be initialized in various ways.
        User user1 = new User("Hari");
        System.out.println(user1.username);

        User user2 = new User("Joel", "joelvcu@gmail.com");
        System.out.println(user2.email);

        User user3 = new User("Hayden", "hayden123@gmail.com", 22);
        System.out.println(user3.age);

        User user4 = new User();
        System.out.println(user4.username);

//        Car car1 = new Car("Ertiga", "Red");
//        Car car2 = new Car("Brezza", "Blue");
//        Car car3 = new Car("City", "Ash");
//
//        Car[] cars = {car1, car2, car3};
//
//        for (int i = 0; i < cars.length; i++){
//            cars[i].drive();
//        }

        // Static = Makes a variable or method belong to the class
        //          rather than to any specific object
        //          Commonly used for utility methods or shared resources
        Friend friend1 = new Friend("Joel");
        System.out.println(friend1.name);

        Friend friend2 = new Friend("Jacob");
        System.out.println(Friend.numOfFriends);

        Friend.showFriends();

        // Inheritance = One class inherits the attributes and methods
        //               from another class
        //               Child <- Parent <- Grandparent
//        Dog dog = new Dog();
//        Cat cat = new Cat();
//        Plant plant = new Plant();
//
//        dog.eat();
//        dog.speak();
//        cat.eat();
//        cat.speak();
//        System.out.println(plant.isAlive);

        // super = Refers to the parent class (subclass <- superclass)
        //         Used in constructors and method overriding
        //         Calls the parent constructor to initialize attributes
        Person person = new Person("Joel", "Samuel");
        person.showName();

        Student student = new Student("Jeiry", "George", 9.3);
        student.showName();

        Employee employee = new Employee("Jacob", "Cherian", 30000);
        employee.showSalary();

        // Method overriding = When a subclass provides its own
        //                     implementation of a method that is already defined
        //                     Allows for code reusability and give specific implementations.
//        Dog dog = new Dog();
//        dog.move();
//
//        Cat cat = new Cat();
//        cat.move();

//        Fish fish = new Fish();
//        fish.move();

        // .toString() = Method inherited from the object class.
        //               Used to return a string representation of an object.
        //               By default, it returns a hash code as a unique identifier.
        //               It can be overridden to provide meaningful details.

//        Car car1 = new Car("Hyundai", "Creta", 2015, "White");
//        System.out.println(car1);
//
//        Car car2 = new Car("Maruti Suzuki", "Brezza", 2026, "Blue");
//        System.out.println(car2);

        // abstract = Used to define abstract classes and methods.
        //            Abstraction is the process of hiding implementation details
        //            and showing only the essential features;
        //            Abstract classes can't be instantiated directly
        //            Can contain 'abstract' methods (which must be implemented)
        //            Can contain 'concrete' methods (which are inherited)

        Circle circle = new Circle(3);
        Triangle triangle = new Triangle(4, 5);
        Rectangle rectangle = new Rectangle(6, 7);

        System.out.println(circle.area());
        System.out.println(triangle.area());
        System.out.println(rectangle.area());
        circle.display();

        // Interface = A blueprint for a class that specifies a set of abstract methods
        //             that implementing classes must define
        //             Supports multiple inheritance-like behavior

        Rabbit rabbit = new Rabbit();
        rabbit.flee();

        Hawk hawk = new Hawk();
        hawk.hunt();

        Fish fish = new Fish();
        fish.flee();
        fish.hunt();

        // Polymorphism = "POLY" = "MANY"
        //                "MORPH" = "SHAPE"
        //                Objects can identify as other objects.
        //                Objects can be treated as objects of a common superclass.

//        Car car = new Car();
//        Bike bike = new Bike();
//        Boat boat = new Boat();
//
//        car.go();
//        bike.go();
//        boat.go();
//
//        Vehicle[] vehicles = {car, bike, boat};
//
//        for (Vehicle vehicle : vehicles) {
//            vehicle.go();
//        }

        // Runtime polymorphism = When the method that gets executed is decided
        //                        at runtime based on the actual type of object.

//        Scanner scanner = new Scanner(System.in);
//
//        Animal animal;
//
//        System.out.print("Would you like dog or cat? (1 = dog, 2 = cat): ");
//        int choice = scanner.nextInt();
//
//        if (choice == 1) {
//            animal = new Dog();
//            animal.speak();
//        } else if (choice == 2) {
//            animal = new Cat();
//            animal.speak();
//        }

        // They help protect object data and add rules for accessing or modifying them.
        // GETTERS = Methods that make a field READABLE.
        // SETTERS = Methods that make a field WRITEABLE.

//        Car car = new Car("Polo", "Red", 587000);
//        car.setColor("Green");
//        System.out.println(car.getColor() + " " + car.getModel() + " " + car.getPrice());

        // Aggregation = Represents a "has-a" relationship between objects.
        //               One object contains another object as part of its structure,
        //               but the contained object/s can exist independently.
        Book book1 = new Book("The Old Man and the Sea",  127);
        Book book2 = new Book("The Great Gatsby",  180);
        Book book3 = new Book("The Hunger Games",  374);

        Book[] books = {book1, book2, book3};

        for (Book book : books) {
            System.out.println(book.displayInfo());
        }

        Library library = new Library("Bharati Bhavan Library", 1889, books);
        library.displayInfo();

        // Composition = Represents a "part-of" relationship between objects
        //               For example, an Engine is "part-of" a Car.
        //               Allows complex objects to be constructed from smaller objects.
        Car car = new Car("Ertiga", 2012, "1.4-litre K14B Petrol engine");
        System.out.println(car.model);
        System.out.println(car.year);
        System.out.println(car.engine.type);
        car.start();

        // Wrapper classes = Allow primitive values (int, char, double, boolean)
        //                   to be used as objects. "Wrap them in an object"
        //                   Generally, don't wrap primitives unless you need an object.
        //                   Allows use of Collections Framework and static Utility Methods.

        // Autoboxing
//        Integer a = 123;
//        Double b = 3.14;
//
//        Character c = new Character('$');
//        Boolean d = new Boolean(true);
//        String e = "Pizza";

        // Unboxing
//        int x = a;
//        double y = b;
//        char z = c;

//        String a = Integer.toString(123);
//        String b = Double.toString(3.14);
//        String c = Character.toString('@');
//        String d = Boolean.toString(true);
//
//        String x = a + b + c + d;
//        System.out.println(x);

        int a = Integer.parseInt("123");
        double b = Double.parseDouble("3.14");
        char c = "Pizza".charAt(0);
        boolean d = Boolean.parseBoolean("true");

        System.out.println(a);

        char letter = 'b';
        System.out.println(Character.isLetter(letter));
        System.out.println(Character.isUpperCase(letter));

        // ArrayList = A resizeable array that stores objects (autoboxing).
        //             Arrays are fixed in size, but ArrayLists can change.

        ArrayList<Integer> list = new ArrayList<>();

        list.add(3);
        list.add(2);
        list.add(1);
        list.remove(1);
        list.set(0, 10);
        System.out.println(list);
        System.out.println(list.get(0));
        System.out.println(list.size());

        Collections.sort(list);
        System.out.println(list);

        for (Integer num : list) {
            System.out.println(num);
        }

        // Exception = An event that interrupts the normal flow of a program
        //             (Dividing by zero, file not found, mismatch input type)
        //             try{}, catch{}, finally{}

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();
            System.out.println(number);
        } catch (ArithmeticException e) {
            System.out.println("You can't divide by zero!");
        } catch (InputMismatchException e) {
            System.out.println("That wasn't a number!");
        } catch (Exception e) {
            // Safety net
            System.out.println("Something went wrong!");
        } finally {
            scanner.close();
            System.out.println("This always execute");
        }

        // How to write a file using Java (4 popular options)

        // FileWriter = Good for small or medium-sized text files
        // BufferedWriter = Better performance for large amounts of text
        // PrintWriter = Best for structured data, like reports or logs
        // FileOutputStream = Best for binary files (e.g., images, audio, files)

//        String textContent = "I like Mandi!\nIt's really good!\nBuy me a mandi";
//
//        try (FileWriter writer = new FileWriter("test.txt");){
//            writer.write(textContent);
//            System.out.println("File has been written");
//        } catch (FileNotFoundException e) {
//            System.out.println("Could not locate file location");
//        } catch (IOException e) {
//            System.out.println("Could not write file");
//        }

        // How to read a file using Java (3 popular options)

        // BufferedReader + FileReader: Best for reading text files line-by-line
        // FileInputStream: Best for binary files (e.g., images, audio files)
        // RandomAccessFile: Best for read/write specific portions of a large file

        String filePath = "test.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath));){

            String line;

            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

        } catch (FileNotFoundException e) {
            System.out.println("Could not locate file");
        } catch (IOException e) {
            System.out.println("Something went wrong");
        }

        // How to work with DATES & TIMES using Java
        // (LocalDate, LocalTime, LocalDateTime, UTC timestamp)

//        LocalDate date = LocalDate.now();
//        System.out.println(date);

        LocalTime time = LocalTime.now();
        System.out.println(time);

//        LocalDateTime dateTime = LocalDateTime.now();
//        System.out.println(dateTime);

        Instant instant = Instant.now();
        System.out.println(instant);

        // Custom format
        LocalDateTime dateTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String newDateTime = dateTime.format(formatter);
        System.out.println(newDateTime);

//        LocalDate date = LocalDate.of(2024, 12, 25);
//        System.out.println(date);

        LocalDateTime dateTime1 = LocalDateTime.of(2024, 12, 25, 12, 0, 0);
        LocalDateTime dateTime2 = LocalDateTime.of(2025, 1,1,0,0,0);

        if (dateTime1.isBefore(dateTime2)) {
            System.out.println(dateTime1 + " is earlier than " + dateTime2);
        }

        // Anonymous class = A class that doesn't have a name. Cannot be reused.
        //                   Add custom behaviour without having to create a new class.
        //                   Often used for one time uses (TimerTask, Runnable, callbacks)

        Dog dog1 = new Dog();
        TalkingDog talkingDog = new TalkingDog();
        Dog dog2 = new Dog() {
            @Override
            void speak () {
                System.out.println("Scooby Doo says Ruh Roh!");
            }
        };

        dog1.speak();
        talkingDog.speak();
        dog2.speak();

        // Timer = Class that schedules tasks at specific times or periodically
        //         Useful for: sending notifications, scheduled updates, repetitive actions

        // TimerTask = Represents the task that will be executed by the Timer
        //             You will extend the TimerTask class to define your task
        //             Create a subclass of TimerTask and @Override run()

        Timer timer = new Timer();
        TimerTask task = new TimerTask() {

            int count = 3;

            @Override
            public void run() {
                System.out.println("Hello");
                count--;
                if (count <= 0) {
                    System.out.println("Task complete");
                    timer.cancel();
                }
            }
        };

        timer.schedule(task, 3000, 1000);

        // Generics = A concept where you can write a class, interface, or method
        //            that is compatible with different data types.
        //            <T> type parameter (placeholder that gets replaced with a real type)
        //            <String> type argument (specifies the type)

        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Strawberry");

        Box<String> box = new Box<>();
        box.setItem("Banana");

        System.out.println(box.getItem());

        Product<String, Double> product = new Product<>("Apple", 162.0);
        System.out.println(product.getItem());
        System.out.println(product.getPrice());

        // HashMap = A data structure that stores key-value pairs
        //           Keys are unique, but Values can be duplicated
        //           Does not maintain any order, but is memory efficient
        //           HashMap<Key, Value>

        HashMap<String, Double> map = new HashMap<>();

        map.put("Apple", 162.0);
        map.put("Orange", 142.5);
        map.put("Banana", 29.0);
        map.put("Coconut", 53.0);

        map.remove("Apple");

        System.out.println(map);
        System.out.println(map.get("Orange"));
        System.out.println(map.containsKey("Apple"));
        System.out.println(map.containsValue(162.0));
        System.out.println(map.size());

        for (String key : map.keySet()) {
            System.out.println(key + " : ₹" + map.get(key));
        }

        // Enums = (Enumerations) A special kind of class that
        //         represents a fixed set of constants.
        //         They improve code readability and are easy to maintain.
        //         More efficient wit switches when comparing Strings.

        Day day = Day.SUNDAY;
        System.out.println(day);
        System.out.println(day.getDayNumber());
    }

    static int add(int... numbers) {
        int sum = 0;

        for (int number : numbers) {
            sum += number;
        }

        return sum;
    }

    static void doSomething(){
        int x = 2; // This is a local variable
        System.out.println(x);
    }

    static double add(double a, double b) {
        return a + b;
    }

    static double add(double a, double b, double c) {
        return a + b + c;
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