package section3;

import java.util.Scanner;

public class loops {
    public static void main(String[] args) {
//        for loop
        int b = 10;
        for (int i = 0; i <= b; i++) {
            System.out.println(i);
        }

        for (int i = 0; i <= b; i += 2) {
            System.out.println("Even numbers less than 10 " + i);
        }

        int factorial = 1;
        for (int i = 1; i <= b; i++) {
            factorial *= i;
            System.out.println(factorial);
        }

//        while loop
        int c = 1;
        while (c < 10) {
            System.out.println(c);
            c++;
        }

        int age = 10;
        Scanner input = new Scanner(System.in);
        while (age > 0) {
            System.out.println("Enter your age: ");
            age = input.nextInt();
            if (age < 0) {
                System.out.println("Age must be a positive value");
            }
        }

//        do while loop
        int e = 1;
        do {
            System.out.println(e);
            e++;
        } while (e <= 10);
    }
}
