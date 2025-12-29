package section3;

import java.util.Scanner;

public class ReadingFromTheConsole {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = input.nextLine();
        System.out.println("Hello, " + name);

        System.out.print("Enter your age: ");
        int age = input.nextInt();
        System.out.println("Hello, " + age);

    }
}
