package Model;

/**
 * Created by histo on 06/03/2017.
 */
public interface IUser {
    boolean createUser(User user);
    boolean deleteUser(String user, String password);
    User findUserById(int id);

    boolean signIn(String username, String password);
}
