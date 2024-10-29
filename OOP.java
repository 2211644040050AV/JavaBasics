public class OOP {

    public static void main(String[] args) {
        // Student s1 = new Student("Ayush");
        // System.out.println(s1.name);

        Pen p1 = new Pen();
        p1.setColor("Yellow");
        System.out.println("Pen color: " + p1.getColor());

    }
}

/**
 * Student
 */
class Student {

    String name;
    int roll;

    Student(String name) {
        this.name = name;
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