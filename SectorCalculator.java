import java.util.Scanner;

public class SectorCalculator {

    // Method to calculate the area of a sector
    public static float calculateArea(float angle, float radius) {
        return (angle / 360.0f) * ((float) Math.PI * radius * radius);
    }

    // Method to calculate the angle given area and radius
    public static float calculateAngle(float area, float radius) {
        return (area * 360.0f) / ((float) Math.PI * radius * radius);
    }

    // Method to calculate the radius given area and angle
    public static float calculateRadius(float area, float angle) {
        return (float) Math.sqrt((area * 360.0f) / (angle * Math.PI));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Choose what you want to calculate:");
        System.out.println("1. Find Area of the Sector");
        System.out.println("2. Find Angle of the Sector");
        System.out.println("3. Find Radius of the Sector");

        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                // Find Area
                System.out.print("Enter the angle (in degrees): ");
                float angle = sc.nextFloat();
                System.out.print("Enter the radius: ");
                float radius = sc.nextFloat();
                float area = calculateArea(angle, radius);
                System.out.println("Area of the sector: " + area);
                break;

            case 2:
                // Find Angle
                System.out.print("Enter the area: ");
                area = sc.nextFloat();
                System.out.print("Enter the radius: ");
                radius = sc.nextFloat();
                angle = calculateAngle(area, radius);
                System.out.println("Angle of the sector: " + angle + " degrees");
                break;

            case 3:
                // Find Radius
                System.out.print("Enter the area: ");
                area = sc.nextFloat();
                System.out.print("Enter the angle (in degrees): ");
                angle = sc.nextFloat();
                radius = calculateRadius(area, angle);
                System.out.println("Radius of the sector: " + radius);
                break;

            default:
                System.out.println("Invalid choice");
        }

        sc.close();
    }
}
