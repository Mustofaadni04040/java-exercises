package section3;

public class VariableNamingAndScope {
    public static int z = 5; // global scope

    public static void main(String[] args) {
        int x = 10; // x has local scope within the main method

        if (x == 10) {
            int y = 11; // block scope
            System.out.println(y);
        }
        System.out.println(x);

    }

    public static void someMethod() {
        System.out.println(z);
    }
}
