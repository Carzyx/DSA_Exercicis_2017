package Controller;

import Model.User;

import java.util.Hashtable;

/**
 * Created by histo on 07/03/2017.
 */
public class ServiceUser {

    private Hashtable<Integer,User> userRegistered = new Hashtable<Integer, User>();

    public boolean createUser(String name, String surname, String username, String password, String email)
    {
        User user = new User(name, surname, username, password, email);
        User response = userRegistered.put(0,user);
        return response != null;
    }

    boolean deleteUser(String username, String password)
    {
        for( Integer i=0; i< userRegistered.size(); i++)
        {
            User user = userRegistered.get(i);
            if(user.username.contentEquals(username) && user.password.contentEquals(password))
            {
                 userRegistered.remove(i);
                 return true;
            }
        }
        return false;
    }

    public User findUserById(int id)
    {
        for( Integer i=0; i< userRegistered.size(); i++)
        {
            if(userRegistered.get(i).id == id) return userRegistered.get(i);
        }
        return null;

    }


}
