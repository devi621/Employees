import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        UserManagement system = new UserManagement();

        Scanner scanner = new Scanner(System.in);

        boolean continueExecution = true;

        while (continueExecution) {
            System.out.println("Choose an operation:");
            System.out.println("1. Add a user");
            System.out.println("2. Delete a user");
            System.out.println("3. Display all users");
            System.out.println("4. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Enter user details:");
                    System.out.print("ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine(); 
                    System.out.print("First Name: ");
                    String firstName = scanner.nextLine();
                    System.out.print("Last Name: ");
                    String lastName = scanner.nextLine();
                    System.out.print("Email: ");
                    String email = scanner.nextLine();
                    System.out.print("Age: ");
                    int age = scanner.nextInt();
                    scanner.nextLine();
                    system.addUser(new User(id, firstName, lastName, email, age));
                    System.out.println("User added successfully.");
                    break;
                case 2:
                    System.out.print("Enter the ID of the user to delete: ");
                    int deleteId = scanner.nextInt();
                    scanner.nextLine();
                    system.deleteUser(deleteId);
                    System.out.println("User deleted successfully.");
                    break;
                case 3:
                    System.out.println("All users:");
                    system.displayAllUsers();
                    break;
                case 4:
                    continueExecution = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 4.");
                    break;
            }
        }

        System.out.println("Exiting the program.");
        scanner.close();
    }
}
