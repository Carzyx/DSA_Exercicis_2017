import java.util.Enumeration;
import java.util.HashMap;
import java.util.Locale;
import java.util.ResourceBundle;

/**
 * Created by Miguel Angel on 10/03/2017.
 */
public class VehicleFactory {

    private static VehicleFactory singleton = null;
    private HashMap<String, IVehicleFactory> singletonVehicle = new HashMap<String, IVehicleFactory>();

    private VehicleFactory(){}

    //Only a instance VehicleFactory
    public static VehicleFactory getInstance()
    {
        if(singleton == null)
            singleton = new VehicleFactory();

        return singleton;
    }

    //Allow create only one instances of diferents object (concret vehicles factories: Seat, Citroen, Mercedes, etc.)
    public IVehicleFactory getVehicle(String nameClass) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        if(singletonVehicle.containsKey(nameClass)){
            return singletonVehicle.get(nameClass);
        }
        Class c = Class.forName(nameClass);
        IVehicleFactory vehicle = (IVehicleFactory) c.newInstance();
        singletonVehicle.put(nameClass,vehicle);
        return vehicle;
    }
}
