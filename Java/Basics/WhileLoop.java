public class WhileLoop {

    public static void main(String[] args) {

        int i = 1;

        System.out.println("Numbers from 1 to 10:");

        while (i <= 10) {
            System.out.print(i + " ");
            i++;
        }

        int sum = 0;
        int number = 1;

        while (number <= 100) {
            sum += number;
            number++;
        }

        System.out.println("\n\nSum of first 100 numbers = " + sum);
    }
}
