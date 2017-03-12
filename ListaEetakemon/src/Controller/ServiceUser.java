package Controller;

import Model.User;

import java.util.Hashtable;

/**
 * Created by histo on 07/03/2017.
 */
public class ServiceUser {

    private Hashtable<Integer,User> userRegistered = new Hashtable<Integer, User>();

    public boolean createUser(String name, String surname, String username, String password, String email, int dni)
    {
        User user = new User(name, surname, username, password, email);
        User response = userRegistered.put(dni,user);
        return response != null;
    }

    boolean deleteUser(int dni, String password)
    {
        User user = userRegistered.get(dni);
        if(user.password.contentEquals(password))
        {
            userRegistered.remove(dni);
            return true;
        }
        return false;
    }

    public User findUserById(int dni)
    {
        return userRegistered.get(dni);

    }


}
