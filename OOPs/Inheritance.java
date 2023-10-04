package OOPs;

public class Inheritance {
    public static void main(String args[]) {

    }
}

// Base class
class Animals {
    String color;

    void eats() {
        System.out.println("eats");
    }

    void breathe() {
        System.out.println("breathes");
    }
}

// Inherited class // single level inheritance
class Fish extends Animals {
    int fins;

    void swim() {
        System.out.println("Swims");
    }
}

// Multi-level inheritance
class Salmon extends Fish {
    String color = "orange";
}

// Hierarchical inheritance
class Mammals extends Animals {
    void walk() {
        System.out.println("Walks");
    }
}

// Hybrid inheritance
class Birds extends Animals {
    void fly() {
        System.out.println("Flies");
    }
}

class Hen extends Birds {
    void fly() {
        System.out.println("These do not fly");
    }
}

class dogs extends Mammals {
    void walk() {
        System.out.println("Walks on 4 legs");
    }
}
// Multiple inheritance is executed using interfaces in java
