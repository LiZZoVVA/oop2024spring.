package Interfaces;

public class Main {
    public static void main(String[] args) {

        // Interface = A blueprint for a class that specifies a set of abstract methods
        //                     that implementing classes MUST define.
        //                     Supports multiple inheritance-like behavior.
        // inheritance - class has single parent, inerface - a class can have multiple parents
        Rabbit rabbit = new Rabbit();
        Hawk hawk = new Hawk();
        Fish fish = new Fish();

        rabbit.flee();
        hawk.hunt();
        fish.flee();
        fish.hunt();

    }
}
