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
        super.color = "Yellow";
        System.out.println("horse constructor is called..");
    }
}