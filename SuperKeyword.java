public class SuperKeyword {
    public static void main(String[] args) {
        Horse h = new Horse();
        System.out.println(h.color);
    }
}

class Animal {
    String color;

    Animal() {
        System.out.println("animl constructor is called..");
    }
}

class Horse extends Animal {
    Horse() {
        super.color = "Yellow"; // Super Keyword - is used to refer immediate parent class object.
        // 1. to access parent's properties
        // 2. to access parent's function
        // 3. to access parent;s constructor
        System.out.println("horse constructor is called..");
    }
}