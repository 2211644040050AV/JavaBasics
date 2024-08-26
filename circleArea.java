import java.util.*;

public class circleArea {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the radius of a circle : ");
        float r = sc.nextFloat();

        double area = Math.PI * Math.pow(r, 2);

        System.out.println(area);
        sc.close();
    }
}