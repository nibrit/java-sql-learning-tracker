public class DoWhileLoop {

    public static void main(String[] args) {

        int i = 1;

        System.out.println("Numbers from 1 to 5:");

        do {
            System.out.print(i + " ");
            i++;
        } while (i <= 5);

        int value = 10;

        do {
            System.out.println("\nExecuted at least once.");
        } while (value < 5);
    }
}
