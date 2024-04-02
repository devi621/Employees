import java.util.ArrayList;
import java.util.List;

public class UserManagement {
    private List<User> userList;

    public UserManagement() {
        this.userList = new ArrayList<>();
    }

    public void addUser(User user) {
        userList.add(user);
    }

    public void deleteUser(int userId) {
        userList.removeIf(user -> user.getId() == userId);
    }

    public void updateUserFirstName(int userId, String newFirstName) {
        for (User user : userList) {
            if (user.getId() == userId) {
                user.setFirstName(newFirstName);
                return;
            }
        }
        System.out.println("User with id " + userId + " not found.");
    }

    public void updateUserEmail(int userId, String newEmail) {
        for (User user : userList) {
            if (user.getId() == userId) {
                user.setEmail(newEmail);
                return;
            }
        }
        System.out.println("User with id " + userId + " not found.");
    }

    public User getUserById(int userId) {
        for (User user : userList) {
            if (user.getId() == userId) {
                return user;
            }
        }
        return null;
    }

    public void displayAllUsers() {
        for (User user : userList) {
            System.out.println(user);
        }
    }

    public boolean getUserList() {

        return false;
    }
}
