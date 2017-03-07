package Test;
import static org.junit.Assert.assertEquals;

import Controller.ServiceEetakemon;
import Model.Eetakemon;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by histo on 06/03/2017.
 */
public class ServiceEetakemonTest {

    ServiceEetakemon defaulServiceEetakemon = new ServiceEetakemon();

    @Test

    public void addElementExpression()
    {
        Eetakemon eetakemon = new Eetakemon("test");
        boolean addEetakemon = defaulServiceEetakemon.addElement(eetakemon);
        assertEquals(true, addEetakemon);
    }

    @Test
    public void deleteElementByIdExpression()
    {
        int id = 0;
        boolean deleteElementyById = defaulServiceEetakemon.deleteElementById(id);
        assertEquals(false, deleteElementyById);
    }

    @Test
    public void findElementByIdExpression()
    {
        int id = 0;
        Eetakemon eetakemon = defaulServiceEetakemon.findElementById(id);
        assertEquals(null, eetakemon );
    }

    @Test
    public void getAllElementsExpression()
    {
        List<Eetakemon> listEetakemon = defaulServiceEetakemon.getAllElements();
        List<Eetakemon> listEetakemonExpected = new ArrayList<Eetakemon>();
        assertEquals(listEetakemonExpected, listEetakemon);
    }



}
