import java.time.LocalDate;
import java.util.Objects;
import java.util.Random;

public class UserProfile {
    int id = 130;
    String name;
    String email;

    LocalDate lastVisitTime;

    public UserProfile(String name, String email) {
        this.name = name;
        this.email = email;
    }

    @Override
    public String toString() {
        return "UserProfile{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserProfile profile = (UserProfile) o;
        return Objects.equals(name, profile.name) && Objects.equals(email, profile.email) && Objects.equals(lastVisitTime, profile.lastVisitTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, email);
    }
}