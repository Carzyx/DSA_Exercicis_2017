package Controller;

import Model.User;

/**
 * Created by histo on 07/03/2017.
 */
public interface IServiceUser {
    boolean createUser(String name, String surname, String username, String password, String email);
    boolean deleteUser(String user, String password);
    User findUserById(int id);

    boolean signIn(String username, String password);
}
