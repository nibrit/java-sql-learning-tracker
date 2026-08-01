public class TypeCasting {

    public static void main(String[] args) {

        // Implicit Type Casting (Widening)
        int number = 100;
        double decimalNumber = number;

        System.out.println("Implicit Casting:");
        System.out.println("Integer: " + number);
        System.out.println("Double: " + decimalNumber);

        // Explicit Type Casting (Narrowing)
        double price = 999.99;
        int wholePrice = (int) price;

        System.out.println("\nExplicit Casting:");
        System.out.println("Double: " + price);
        System.out.println("Integer: " + wholePrice);

        // Character to Integer
        char letter = 'A';
        int ascii = letter;

        System.out.println("\nCharacter to Integer:");
        System.out.println("Character: " + letter);
        System.out.println("ASCII Value: " + ascii);

        // Integer to Character
        int value = 66;
        char character = (char) value;

        System.out.println("\nInteger to Character:");
        System.out.println("Integer: " + value);
        System.out.println("Character: " + character);

        // Overflow Example
        int largeNumber = 130;
        byte smallNumber = (byte) largeNumber;

        System.out.println("\nOverflow Example:");
        System.out.println("Original Integer: " + largeNumber);
        System.out.println("After Casting to byte: " + smallNumber);
    }
}
