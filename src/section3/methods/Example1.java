package section3.methods;

public class Example1 {
    public static void main(String[] args) {
        double radius = 5;
        double circleArea = calculateCircleArea(radius);

        System.out.println("The area of the circle is " + circleArea);
    }

    public static double calculateCircleArea(double radius) {
        return 3.14 * radius * radius;
    }
}
