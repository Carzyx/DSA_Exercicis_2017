package Controller;

import Model.Eetakemon;

import java.util.List;

/**
 * Created by histo on 07/03/2017.
 */
public interface IServiceEetakemon {
    boolean addElement(Eetakemon eetakemon);
    boolean deleteElementById(int id);
    Eetakemon findElementById(int id);
    List<Eetakemon> getAllElements();
}
