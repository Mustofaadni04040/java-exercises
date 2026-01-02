package section3;

public class IfElseStatement {
    public static void main(String[] args) {
        int x = 5;

        if (x > 10) {
            System.out.println("x is greater than 10");
        } else {
            System.out.println("x is less than 10");
        }


        int num = 5;

        if (num % 2 == 0) {
            System.out.println("num is even");
        } else {
            System.out.println("num is odd");
        }

        int age = 25;

        if (age >= 20) {
            System.out.println("You are an adult...");
        } else {
            System.out.println("You are a child...");
        }

        int z = 15;
        int b = 3;

        if (z > b) {
            System.out.println("z is greater than 15");
        } else if (z < b) {
            System.out.println("z is less than 15");
        } else {
            System.out.println("z and b are equal");
        }
    }
}
