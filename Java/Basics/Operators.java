public class Operators {

    public static void main(String[] args) {

        int a = 20;
        int b = 10;

        // Arithmetic Operators
        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Division: " + (a / b));
        System.out.println("Modulus: " + (a % b));

        // Relational Operators
        System.out.println("a > b: " + (a > b));
        System.out.println("a < b: " + (a < b));
        System.out.println("a == b: " + (a == b));
        System.out.println("a != b: " + (a != b));

        // Logical Operators
        boolean x = true;
        boolean y = false;

        System.out.println("x && y: " + (x && y));
        System.out.println("x || y: " + (x || y));
        System.out.println("!x: " + (!x));

        // Assignment Operator
        int number = 10;
        number += 5;
        System.out.println("After += 5: " + number);

        // Unary Operators
        int count = 5;
        System.out.println("Original: " + count);
        System.out.println("Post Increment: " + count++);
        System.out.println("After Increment: " + count);
        System.out.println("Pre Increment: " + ++count);

        // Ternary Operator
        int max = (a > b) ? a : b;
        System.out.println("Largest value: " + max);
    }
}
