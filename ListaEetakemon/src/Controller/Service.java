package Controller;

import Model.Eetakemon;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by histo on 21/02/2017.
 */
public class Service {
    private List<Eetakemon> listEetakemon = new ArrayList<Eetakemon>();
    private static int id = 1;

    public Service(){};

    public void addElement(Eetakemon e)
    {
        e.level = calculateLevel();
        e.id = calculateId();
        listEetakemon.add(e);
    }

    public boolean deleteElementById(int id)
    {
        for (int i = 0; i < listEetakemon.size(); i++) {
            if (listEetakemon.get(i).id == id) {
                listEetakemon.remove(i);
                return  true;
            }
        }
        return false;
    }

    public Eetakemon findElementById(int id)
    {
        for(Eetakemon e: listEetakemon)
        {
            if(e.id == id) return e;
        }
        return null;
    }

    public List<Eetakemon>  getAllElements()
    {
        return listEetakemon;
    }

    private int calculateLevel()
    {
        Random r = new Random();
        return r.nextInt(20);
    }

    private int calculateId()
    {
        return id++;
    }
}
