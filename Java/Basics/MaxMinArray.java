public class MaxMinArray {

    public static void main(String[] args) {

        int[] numbers = {12, 45, 7, 89, 23};

        int max = numbers[0];
        int min = numbers[0];

        for (int num : numbers) {

            if (num > max) {
                max = num;
            }

            if (num < min) {
                min = num;
            }
        }

        System.out.println("Maximum: " + max);
        System.out.println("Minimum: " + min);
    }
}
