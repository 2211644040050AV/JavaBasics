public class MethodOverloading {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println(calc.Sum(1, 2));
    }
}

/**
 * InnerMethodOverloading
 */
class Calculator {
    public static int Sum(int a, int b) {
        return a + b;
    }

    public static float Sum(float a, float b) {
        return a + b;
    }

    public static int Sum(int a, int b, int c) {
        return a + b + c;
    }

    public static float Sum(float a, float b, float c) {
        return a + b + c;
    }
}