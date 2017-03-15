import java.util.ArrayList;
import java.util.List;

/**
 * Created by Miguel Angel on 11/03/2017.
 */
public interface IVehicleFactory {

    enum ModelVehicle{SEAT, MERCEDES, YAMAHA, BMW, AIRBUS, BOING}
    enum MotorVehicle{GASOIL, DIESEL}
    enum ColorVehicle{RED, BLUE, GREEN, YELLOW, BLACK}



    void printMessage();

    void createVehicle(ModelVehicle model, MotorVehicle motor, ColorVehicle color);

    void showAllVehicles();



    }