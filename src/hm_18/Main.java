package hm_18;

import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {

        UserRepository repo = new UserRepository();

        // Search for a user by ID
        Optional<User> userById = repo.findUserById(3);
        userById.ifPresentOrElse(
                user -> System.out.println("User found by ID: " + user),
                () -> System.out.println("No user found with this ID")
        );

        // Search for a user by email
        Optional<User> userByEmail = repo.findUserByEmail("niki@gmail.com");
        userByEmail.ifPresentOrElse(
                user -> System.out.println("User found by email: " + user),
                () -> System.out.println("No user found with this email")
        );

        // Getting a list of all users
        Optional<List<User>> allUsers = repo.findAllUsers();
        allUsers.ifPresentOrElse(
                list -> System.out.println("Кількість користувачів: " + list.size()),
                () -> System.out.println("Список користувачів порожній")
        );

    }
}
