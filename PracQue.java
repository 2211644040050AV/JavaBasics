public class PracQue {
    // Find out the correct statement to assign name to object
    // a. s -> name = "ayush"
    // b. Student.name = "ayush"
    // s.name = "ayush"
    public static void main(String[] args) {
        Student s = new Student();
        s.name = "ayush";
        System.out.println(s.name);
    }
}

class Student {
    String name;
    int marks;
}
