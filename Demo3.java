import java.util.Scanner;

public class Demo3{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input from the user
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter second number: ");
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

