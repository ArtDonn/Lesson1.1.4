package jm.task.core.jdbc;

import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

public class Main {

    public static final UserService userService = new UserServiceImpl();
    public static final User user1 = new User("Armen", "Chilikyn" , (byte) 23 );
    public static final User user2 = new User("Artem", "Donscov" , (byte) 21);
    public static final User user3 = new User("Aleks", "lev" , (byte) 99 );
    public static final User user4 = new User("Richard", "Melkonyn" , (byte) 30 );

    public static void main(String[] args) {

        userService.createUsersTable();

        userService.removeUserById(2);

        userService.getAllUsers();

        userService.cleanUsersTable();

        userService.dropUsersTable();

    }
}