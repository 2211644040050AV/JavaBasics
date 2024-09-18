// find the largest number in a given array
public interface largesNumber {
    public static int large_Number(int number[]) {
        int largest = Integer.MIN_VALUE; // -infinity
        int smallest = Integer.MAX_VALUE; // +infinity
        for (int i = 0; i < number.length; i++) {
            if (largest < number[i]) {
                largest = number[i];
            }
            if (smallest > number[i]) {
                smallest = number[i];
            }
        }
        System.out.println("Smallest value is : " + smallest);
        return largest;
    }

    public static void main(String[] args) {
        int number[] = { 5, 15, 7, 30, 7, 44, 66, 102, 2, 3, 4 };
        System.out.println("Largest number is : " + large_Number(number));
    }
}
