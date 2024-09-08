package Arrays;

import java.util.Scanner;

public class Sandip {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your first number");
        int age = scan.nextInt();
        System.out.println("Enter your second number");
        int age1 = scan.nextInt();
        int sum = age + age1;
        System.out.println(sum);
        for (int line = 1; line <= 10; line++) {
            for (int star = 1; star <= line; star++) {
                System.out.print("s"+" ");
            }
            System.out.println();
        }
    }
}
