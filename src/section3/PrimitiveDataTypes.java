package section3;

public class PrimitiveDataTypes {
    public static void main(String[] args) {
        // byte can store a number between -128 and 127
        byte age = 25;
        // short can store a number between -32,768 and 32,767
        short year = 1970;
        // int can store a number between -2,147,483,648 and 2,147,483,647
        int population = 10000;
        // long can store a number between -9,223,372,036,854,775,808 and 9,223,372,036,854,775,807
        long distance = 1000000;
        // float can store fractional numbers with about 6–7 decimal digits of precision
        float weight = 58.5f;
        // double can store fractional numbers with about 15–16 decimal digits of precision
        double height = 178.6;
        // char can store a single Unicode character (16-bit, from \u0000 to \uFFFF)
        char grade = 'A';
        // unicode value for the letter A is 65, so we could also initialize the char var as:
        char grade2 = 65;
        // boolean can store only two values: true or false
        boolean isStudent = false;
    }
}
