import java.util.Scanner;

public class ArithmeticOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        if (!scanner.hasNextDouble()) {
            System.out.println("Invalid input! Please enter a valid number.");
            return;
        }
        double num1 = scanner.nextDouble();

        System.out.print("Enter second number: ");
        if (!scanner.hasNextDouble()) {
            System.out.println("Invalid input! Please enter a valid number.");
            return;
        }
        double num2 = scanner.nextDouble();

        // Performing arithmetic operations
        double sum = num1 + num2;
        double difference = num1 - num2;
        double product = num1 * num2;
        double quotient = (num2 != 0) ? (num1 / num2) : Double.NaN; // Avoid division by zero
        double modulus = (num2 != 0) ? (num1 % num2) : Double.NaN;

        // Displaying results
        System.out.println("\nResults:");
        System.out.println("Addition: " + sum);
        System.out.println("Subtraction: " + difference);
        System.out.println("Multiplication: " + product);
        System.out.println("Division: " + quotient);
        System.out.println("Modulus: " + modulus);

        scanner.close();
    }
}

