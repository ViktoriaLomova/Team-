import java.util.Arrays;
import java.util.Objects;

public class User {
    Integer userId;
    String name,email,password;
    Byte[] profilePicture;

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

    public Byte[] getProfilePicture() {
        return profilePicture;
    }

    public void setProfilePicture(Byte[] profilePicture) {
        this.profilePicture = profilePicture;
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
