package section3.methods;

public class Example3 {
    public static void main(String[] args) {
//        void doesn't return anything
        printHello();
        printHello2("Ucok");

    }

    public static void printHello() {
        System.out.println("Hello World");
    }

    public static void printHello2(String name) {
        System.out.println("Hello " + name);
    }
}
