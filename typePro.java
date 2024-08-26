public class typePro {

    public static void main(String[] args) {

        // type promotion in expression
        // byte b = 5;
        // b = (byte) (b * 2);
        // System.out.println(b);

        // char a = 'A';
        // char b = 'g';
        // System.out.println((int) (a));
        // System.out.println((int) (b));
        // System.out.println(b - a);

        short a = 6;
        byte b = 14;
        char c = 's';
        byte bt = (byte) (a + b + c);
        System.out.println(bt);
    }

}