public class OOP {

    public static void main(String[] args) {
        Student s1 = new Student("Ayush");
        System.out.println(s1.name);
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