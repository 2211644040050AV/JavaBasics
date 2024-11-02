public class MethodAbstract {
    public static void main(String[] args) {
        // Horse h = new Horse();
        // h.eat();
        // h.walk();
        // Chicken c = new Chicken();
        // c.walk();

        Mustang myHorse = new Mustang(); // Animal -> Horse -> Mustang
    }
}

abstract class Animal {
    String color;

    Animal() { // Constuctor
        System.out.println("Animal constructor called..");
    }

    void eat() {
        System.out.println("animal eats..");
    }

    abstract void walk();
}

class Horse extends Animal {
    Horse() {
        System.out.println("horse constructor called..");
    }

    void changeColor() {
        color = "dark brown";
    }

    void walk() {
        System.out.println("walks on 4 legs");
    }
}

class Mustang extends Horse {
    Mustang() {
        System.out.println("Mustang constructor called..");
    }
}

class Chicken extends Animal {
    void changeColor() {
        color = "yellow";
    }

    void walk() {
        System.out.println("walks on 2 legs");
    }
}