public class Car{ //extends Vehicle

    String model;
    int year;
    Engine engine;

    Car (String model, int year, String engineType) {
        this.model = model;
        this.year = year;
        this.engine = new Engine(engineType);
    }

    void start () {
        this.engine.start();
        System.out.println("The " + this.model + " is running");
    }

//    private String model;
//    private String color;
//    private int price;
//
//    Car (String model, String color, int price) {
//        this.model = model;
//        this.color = color;
//        this.price = price;
//    }
//
//    String getModel() {
//        return this.model;
//    }
//
//    String getColor() {
//        return this.color;
//    }
//
//    String getPrice() {
//        return "₹" + this.price;
//    }
//
//    void setColor(String color) {
//        this.color = color;
//    }
//
//    void setPrice(int price) {
//        if (price < 0) {
//            System.out.println("Price cannot be less than 0");
//        } else {
//            this.price = price;
//        }
//    }

//    @Override
//    void go () {
//        System.out.println("You drive the car!");
//    }

//    String make;
//    String model;
//    int year;
//    String color;
//
//    Car (String make, String model, int year, String color) {
//        this.make = make;
//        this.model = model;
//        this.year = year;
//        this.color = color;
//    }
//
//    @Override
//    public String toString () {
//        return this.color + " " + this.year + " " + this.make + " " + this.model;
//    }

//    String model;
//    String color;
//
//    Car(String model, String color) {
//        this.model = model;
//        this.color = color;
//    }
//
//    void drive() {
//        System.out.println("You drive the " + this.color + " " + this.model);
//    }

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
