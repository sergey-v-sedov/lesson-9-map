import java.time.LocalDate;

public class UserProfile {
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
}