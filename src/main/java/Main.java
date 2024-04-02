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
    }
}