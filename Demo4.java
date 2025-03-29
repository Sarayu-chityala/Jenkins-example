public class Demo4 {
    public static void main(String[] args) {
        // Check if exactly 3 arguments are passed
        if (args.length < 3) {
            System.out.println("Please provide 3 arguments: Name, Roll Number, Department.");
            return; // Exit if not enough arguments are provided
        }

        // Assigning command-line arguments to variables
        String name = args[0];
        String rollNumber = args[1];
        String department = args[2];

        // Displaying the data
        System.out.println("--- Student Details ---");
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Department: " + department);
    }
}

