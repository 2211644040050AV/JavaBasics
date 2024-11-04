public class OOP {

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.schoolName = "WWP";
        System.out.println(s1.schoolName);

        // Pen p1 = new Pen();
        // p1.setColor("Yellow");
        // System.out.println("Pen color: " + p1.getColor());

        Fish shark = new Fish();
        shark.eat();

    }
}

/**
 * Student
 */
class Student {

    String name;
    int roll;

    static String schoolName;

    // Student(String name) {
    // this.name = name;
    // }

    void setName(String name) {
        this.name = name;
    }

    String getName() {
        return this.name;
    }
}

/**
 * Pen
 */
class Pen {
    private String color;
    private int tip;

    String getColor() {
        return this.color;
    }

    int getTip() {
        return this.tip;
    }

    void setColor(String newColor) {
        color = newColor;
    }

    void setTip(int newTip) {
        tip = newTip;
    }

}

/**
 * Animal
 */
// Base Clss
class Animal {
    // Inheritance
    String color;

    void eat() {
        System.out.println("Eats..");
    }

    void breathe() {
        System.out.println("Breathes..");
    }

}

/**
 * Fish
 */
// Derived Class
class Fish extends Animal {
    int fins;

    void swim() {
        System.out.println("Swims in water..");
    }
}