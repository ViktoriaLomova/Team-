import Models.User;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class UserTest {
    private User user;
    private static final Integer TEST_ID = 1;
    private static final String TEST_NAME = "Test User";
    private static final String TEST_EMAIL = "test@example.com";
    private static final String TEST_PASSWORD = "testPassword";

    @BeforeMethod
    public void setUp() {
        user = new User(TEST_ID, TEST_NAME, TEST_EMAIL, TEST_PASSWORD, null);
    }

    @Test
    public void testUserCreation() {
        Assert.assertNotNull(user, "User object should not be null");
        Assert.assertEquals(user.getUserId(), TEST_ID, "User ID should match");
        Assert.assertEquals(user.getName(), TEST_NAME, "User name should match");
        Assert.assertEquals(user.getEmail(), TEST_EMAIL, "User email should match");
        Assert.assertEquals(user.getPassword(), TEST_PASSWORD, "User password should match");
    }

    @Test
    public void testUserBlockedUsers() {
        User[] blockedUsers = new User[]{
            new User(2, "Blocked User", "blocked@example.com", "password", null)
        };
        user.setUserBlockedUsers(blockedUsers);
        Assert.assertEquals(user.getUserBlockedUsers(), blockedUsers, "Blocked users should match");
    }

    @Test
    public void testUserFriendships() {
        User[] friends = new User[]{
            new User(3, "Friend User", "friend@example.com", "password", null)
        };
        user.setUserFriendships(friends);
        Assert.assertEquals(user.getUserFriendships(), friends, "Friends should match");
    }

    @Test
    public void testNullProfilePicture() {
        Assert.assertNull(user.getProfilePicture(), "Profile picture should be null by default");
    }

    @Test()
    public void testSuccessfulTest() {
        Assert.assertTrue(true, "Этот тест всегда успешен");
    }

    @Test()
    public void testFailingTest() {
        User user2 = new User(2, "Test User 2", "test2@example.com", "password", null);
        Assert.assertEquals(user2.getName(), "Wrong Name", 
            "Этот тест специально падает");
    }
}
