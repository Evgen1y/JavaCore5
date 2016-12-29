package Module8;


import java.util.ArrayList;
import java.util.List;

/**
 * Created by bulov on 28.12.2016.
 */
public class Main {
    public static void main(String[] args) {
        User[] users = new User[5];
        users[0] = new User(1L, "Harry");
        users[1] = new User(2L, "Mike");
        users[2] = new User(3L, "John");
        users[3] = new User(4L, "Lucy");
        users[4] = new User(5L, "Tom");
        User user = new User(6L, "Rose");

        List<User> userList = new ArrayList<>();
        for(User u: users){
            userList.add(u);
        }
        //List<User> userList =

        UserDAO userDAO = new UserDAO();

        userDAO.save(user);
        userDAO.saveAll(userList);
        System.out.println(userDAO);

        userDAO.deleteAll(userList);
        System.out.println(userDAO);

        userDAO.delete(user);
        System.out.println(userDAO);

        userDAO.saveAll(userList);
        userDAO.deleteById(4);
        System.out.println(userDAO);

        System.out.println(userDAO.get(3));

    }
}
