// Linear Search

import java.util.Scanner;

public class linearSearch {
    public static int Linear_Search(int num[], int key) {
        for (int i = 0; i < num.length; i++) {
            if (num[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num[] = { 14, 12, 23, 45, 15, 62, 70, 85, 94, 10 };
        System.out.print("Enter the value which you want to search in between 1 to 10 : ");
        int key = sc.nextInt();
        int index = Linear_Search(num, key);
        if (index == -1) {
            System.out.println("NOT FOUND!");
        } else {
            System.out.println("Key is at index : " + index);
        }
        sc.close();
    }
}