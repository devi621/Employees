import exceptions.UserManagementException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MainTest {

    private UserManagement system;

    @BeforeEach
    public void setUp() throws UserManagementException {
        system = new UserManagement();
        // Add initial users for testing
        system.addUser(new User(1, "Samantha", "Wolf", "samy@mail.com", 30));
        system.addUser(new User(2, "Andrew", "Grey", "andrewg@mail.com", 25));
    }

    @Test
    public void testAddUser() throws UserManagementException {
        system.addUser(new User(5, "Alice", "Smith", "alice@example.com", 35));
        assertNotNull(system.getUserById(3), "User with id 3 should exist");
    }

    @Test
    public void testDeleteUser() throws UserManagementException {
        system.deleteUser(2);
        assertNull(system.getUserById(2), "User with id 2 should be deleted");
    }

    @Test
    public void testUpdateUserFirstName() throws UserManagementException {
        system.updateUserFirstName(1, "Claire");
        assertEquals("Claire", system.getUserById(1).getFirstName(), "First name should be updated to Claire");
    }

    @Test
    public void testUpdateUserEmail() throws UserManagementException {
        system.updateUserEmail(1, "claire.wolf@mail.com");
        assertEquals("claire.wolf@mail.com", system.getUserById(1).getEmail(), "Email should be updated to claire.wolf@mail.com");
    }
}
