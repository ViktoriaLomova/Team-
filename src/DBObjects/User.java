package DBObjects;

import java.util.Arrays;
import java.util.Objects;

public class User {
    Integer userId;
    String name,email,password;
    byte[] profilePicture;
    User[] userBlockedUsers;
    User[] userFriendships;
    Task[] userTasks;
    Event[] userEvents;

    public User(Integer userId, String name, String email, String password, byte[] profilePicture) {
        this.userId = userId;
        this.name = name;
        this.email = email;
        this.password = password;
        this.profilePicture = profilePicture;
    }

    public User[] getUserBlockedUsers() {
        return userBlockedUsers;
    }

    public void setUserBlockedUsers(User[] userBlockedUsers) {
        this.userBlockedUsers = userBlockedUsers;
    }

    public User[] getUserFriendships() {
        return userFriendships;
    }

    public void setUserFriendships(User[] userFriendships) {
        this.userFriendships = userFriendships;
    }

    public Task[] getUserTasks() {
        return userTasks;
    }

    public void setUserTasks(Task[] userTasks) {
        this.userTasks = userTasks;
    }

    public Event[] getUserEvents() {
        return userEvents;
    }

    public void setUserEvents(Event[] userEvents) {
        this.userEvents = userEvents;
    }


    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public byte[] getProfilePicture() {
        return profilePicture;
    }

    public void setProfilePicture(byte[] profilePicture) {
        this.profilePicture = profilePicture;
    }



    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", profilePicture=" + Arrays.toString(profilePicture) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(getUserId(), user.getUserId()) && Objects.equals(getName(), user.getName()) && Objects.equals(getEmail(), user.getEmail()) && Objects.equals(getPassword(), user.getPassword()) && Objects.deepEquals(getProfilePicture(), user.getProfilePicture());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getUserId(), getName(), getEmail(), getPassword(), Arrays.hashCode(getProfilePicture()));
    }
}
