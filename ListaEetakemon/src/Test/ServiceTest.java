package Test;
import static org.junit.Assert.assertEquals;

import Controller.Service;
import Model.Eetakemon;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by histo on 06/03/2017.
 */
public class ServiceTest {

    @Test

    public void addElementExpression()
    {
        Service service = new Service();
        Eetakemon eetakemon = new Eetakemon("test");
        boolean addEetakemon = service.addElement(eetakemon);
        assertEquals(true, addEetakemon);

    }

    @Test
    public void deleteElementByIdExpression()
    {
        Service service = new Service();
        int id = 0;
        boolean deleteElementyById = service.deleteElementById(id);
        assertEquals(false, deleteElementyById);
    }

    @Test
    public void findElementByIdExpression()
    {
        Service service = new Service();
        int id = 0;
        Eetakemon eetakemon = service.findElementById(id);
        assertEquals(null, eetakemon );
    }

    @Test
    public void getAllElementsExpression()
    {
        Service service = new Service();
        List<Eetakemon> listEetakemon = service.getAllElements();
        List<Eetakemon> listEetakemonExpected = new ArrayList<Eetakemon>();
        assertEquals(listEetakemonExpected, listEetakemon);
    }



}
