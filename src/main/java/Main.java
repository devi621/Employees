import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        UserManagement system = new UserManagement();

        // Adaugam utilizatori
        system.addUser(new User(1, "Samantha", "Wolf", "samy@mail.com", 30));
        system.addUser(new User(2, "Andrew", "Grey", "andrewg@mail.com", 25));
        system.addUser(new User(3,"Marina", "Price", "marina.p@mail.com", 24));

        // Afisam toti utilizatorii
        System.out.println("All users:");
        system.displayAllUsers();
        System.out.println();

        // Afisam un utilizator dupa id
        System.out.println("User with id 1:");
        User user = system.getUserById(1);
        if (user != null) {
            System.out.println(user);
        } else {
            System.out.println("User not found.");
        }
        System.out.println();

        // Ștergem un utilizator
        System.out.println("Deleting user with id 2:");
        system.deleteUser(2);
        system.displayAllUsers();
        System.out.println();

        // Modificam numele unui utilizator
        System.out.println("Updating first name of user with id 1:");
        system.updateUserFirstName(1, "Claire");
        system.displayAllUsers();
        System.out.println();

        // Modificam emailul unui utilizator
        System.out.println("Updating email of user with id 1:");
        system.updateUserEmail(1, "claire.wolf@mail.com");
        system.displayAllUsers();

        Scanner scanner = new Scanner(System.in);

        boolean continueExecution = true;

        while (continueExecution) {
            System.out.println("Choose an operation:");
            System.out.println("1. Add a user");
            System.out.println("2. Delete a user");
            System.out.println("3. Display all users");
            System.out.println("4. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.println("Enter user details:");
                    System.out.print("ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    System.out.print("First Name: ");
                    String firstName = scanner.nextLine();
                    System.out.print("Last Name: ");
                    String lastName = scanner.nextLine();
                    System.out.print("Email: ");
                    String email = scanner.nextLine();
                    System.out.print("Age: ");
                    int age = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    system.addUser(new User(id, firstName, lastName, email, age));
                    System.out.println("User added successfully.");
                    break;
                case 2:
                    System.out.print("Enter the ID of the user to delete: ");
                    int deleteId = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
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