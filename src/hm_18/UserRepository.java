package hm_18;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class UserRepository {
    private List<User> users = new ArrayList<>();

    // Create Users
    public UserRepository() {
        users.add(new User(1, "Niki", "niki@gmail.com"));
        users.add(new User(2,"Mike", "mike@gmail.com"));
        users.add(new User(3, "Jine", "jine@gmail.com"));
    }

    public Optional<User> findUserById(int id) {
        return users.stream()
                .filter(user -> user.getId() == id)
                .findFirst();
    }

    public Optional<User> findUserByEmail(String email) {
        return users.stream()
                .filter(user -> user.getEmail().equalsIgnoreCase(email))
                .findFirst();
    }

    public Optional<List<User>> findAllUsers() {
        return users.isEmpty() ? Optional.empty() : Optional.of(users);
    }
}
