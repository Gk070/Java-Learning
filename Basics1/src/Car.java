public class Car {

    String model;
    String color;

    Car(String model, String color) {
        this.model = model;
        this.color = color;
    }

    void drive() {
        System.out.println("You drive the " + this.color + " " + this.model);
    }

//    String make = "Maruti";
//    String model = "800";
//    int year = 2014;
//    double price = 85000;
//    boolean isRunning = false;
//
//    void start() {
//        System.out.println("You start the engine");
//    }
//
//    void stop() {
//        System.out.println("You stop the engine");
//    }
}
