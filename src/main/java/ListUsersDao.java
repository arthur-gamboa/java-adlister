import java.util.ArrayList;
import java.util.List;

public class ListUsersDao implements Users {

    private List<User> users;

    public List<User> all() {
        if (users == null) {
            users = generateUsers();
        }
        return users;
    }

    private List<User> generateUsers() {
        List<User> users = new ArrayList<>();
        users.add(new User(
                1,
                "Arthur",
                "arthur@arthur.com",
                "password"
        ));
        users.add(new User(
                2,
                "john",
                "john@john.com",
                "passwords"
        ));
        return users;
    }
}
