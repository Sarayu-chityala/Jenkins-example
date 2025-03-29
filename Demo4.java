import java.util.Scanner;

public class Demo4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input from the user
        System.out.print("Enter Student Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Roll Number: ");
        int rollNumber = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character left by nextInt()

        System.out.print("Enter Department: ");
        String department = scanner.nextLine();

        // Displaying the student details
        System.out.println("\n--- Student Details ---");
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Department: " + department);

        scanner.close();
    }
}

