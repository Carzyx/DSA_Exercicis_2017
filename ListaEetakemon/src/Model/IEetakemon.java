package Model;

import java.util.List;

/**
 * Created by histo on 06/03/2017.
 */
public interface IEetakemon {
    void addElement(Eetakemon eetakemon);
    boolean deleteElementById(int id);
    Eetakemon findElementById(int id);
    List<Eetakemon> getAllElements();
}
