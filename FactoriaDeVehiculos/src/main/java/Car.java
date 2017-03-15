import java.util.ArrayList;
import java.util.List;

/**
 * Created by Miguel Angel on 10/03/2017.
 */
public class Car implements IVehicleFactory {

    private static String type = "Car";
    private List<Vehicle> queueProducts = new ArrayList<Vehicle>();


    public void printMessage() {
        System.out.println("Welcome to Car Factory");
    }

    @Override
    public void createVehicle(IVehicleFactory.ModelVehicle model, IVehicleFactory.MotorVehicle motor, IVehicleFactory.ColorVehicle color) {

        Vehicle vehicle = new Vehicle(type, model.name(), motor.name(), color.name());
        addCreationQueue(vehicle);
    }

    private void addCreationQueue(Vehicle vehicle) {

        queueProducts.add(vehicle);
        System.out.println("Vehicle added in the creation Queue");
    }

    @Override
    public void showAllVehicles()
    {
        for (Vehicle vehicle : queueProducts)
        {
            System.out.println(vehicle.type+" "+vehicle.model+" "+vehicle.color+" "+vehicle.motor);
        }
    }


}
