import java.util.Scanner;

public class Armstrong {

    // Function to check if a number is an Armstrong number
    public static boolean isArmstrong(int number) {
        int originalNumber = number;
        int sum = 0;
        int digits = String.valueOf(number).length(); // Calculate the number of digits

        while (number > 0) {
            int digit = number % 10;
            sum += Math.pow(digit, digits); // Raise the digit to the power of the number of digits
            number /= 10;
        }

        return sum == originalNumber;
    }

    // Function to print all Armstrong numbers within a given range
    public static void printArmstrongNumbersInRange(int start, int end) {
        System.out.println("Armstrong numbers between " + start + " and " + end + ":");
        for (int i = start; i <= end; i++) {
            if (isArmstrong(i)) {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the range from the user
        System.out.print("Enter the start of the range: ");
        int start = scanner.nextInt();

        System.out.print("Enter the end of the range: ");
        int end = scanner.nextInt();

        // Print Armstrong numbers in the range
        printArmstrongNumbersInRange(start, end);

        scanner.close();
    }
}