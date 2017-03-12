package Test;
import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;
import java.util.List;

import Controller.ServiceEetakemon;
import Model.Eetakemon;


/**
 * Created by histo on 06/03/2017.
 */
public class ServiceEetakemonTest {

    static ServiceEetakemon defaulServiceEetakemon = new ServiceEetakemon();

    @BeforeClass
    public static void init()
    {
        defaulServiceEetakemon.addElement(new Eetakemon("Eetakemon1"));
        defaulServiceEetakemon.addElement(new Eetakemon("Eetakemon2"));
        defaulServiceEetakemon.addElement(new Eetakemon("Eetakemon3"));
        defaulServiceEetakemon.addElement(new Eetakemon("Eetakemon4"));
    }


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
        int idOK = 1;
        boolean deleteElementyByIdOK = defaulServiceEetakemon.deleteElementById(idOK);
        assertEquals(true, deleteElementyByIdOK);

        int idKO = 10;
        boolean deleteElementyByIdKO = defaulServiceEetakemon.deleteElementById(idKO);
        assertEquals(false, deleteElementyByIdKO);
    }

    @Test
    public void findElementByIdExpression()
    {
        int idOK = 3;
        Eetakemon eetakemonKO = defaulServiceEetakemon.findElementById(idOK);
        assertEquals(defaulServiceEetakemon.findElementById(idOK), eetakemonKO );

        int idKO = 10;
        Eetakemon eetakemonOK = defaulServiceEetakemon.findElementById(idKO);
        assertEquals(null, eetakemonOK );
    }

    @Test
    public void getAllElementsExpression()
    {
        List<Eetakemon> listEetakemonOK = defaulServiceEetakemon.getAllElements();
        assertEquals(defaulServiceEetakemon.getAllElements(), listEetakemonOK);
    }



}
