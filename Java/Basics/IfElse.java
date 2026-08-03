public class IfElse {

    public static void main(String[] args) {

        int marks = 82;

        if (marks >= 90) {
            System.out.println("Grade: A+");
        } else if (marks >= 80) {
            System.out.println("Grade: A");
        } else if (marks >= 70) {
            System.out.println("Grade: B");
        } else if (marks >= 60) {
            System.out.println("Grade: C");
        } else {
            System.out.println("Grade: Fail");
        }

        // Nested If
        int age = 20;
        boolean hasLicense = true;

        if (age >= 18) {
            if (hasLicense) {
                System.out.println("Eligible to drive.");
            } else {
                System.out.println("Apply for a driving license.");
            }
        } else {
            System.out.println("Not eligible to drive.");
        }

        // Even or Odd
        int number = 25;

        if (number % 2 == 0) {
            System.out.println(number + " is Even");
        } else {
            System.out.println(number + " is Odd");
        }
    }
}
