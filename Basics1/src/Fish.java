public class Fish implements Prey, Predator { //extends Animal

    @Override
    public void flee () {
        System.out.println("The fish is swimming away!");
    }

    @Override
    public void hunt () {
        System.out.println("The fish is hunting!");
    }

//    @Override
//    void move () {
//        System.out.println("This animal is swimming");
//    }

}
