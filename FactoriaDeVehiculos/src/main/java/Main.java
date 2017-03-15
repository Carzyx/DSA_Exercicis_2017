public class Main {

    public static void main(String[] args) throws IllegalAccessException, InstantiationException, ClassNotFoundException {
	// write your code here

        I18Manager s1 = I18Manager.getInstance();

        I18Manager s2 = I18Manager.getInstance();

        if(s1 == s2)
        {
            System.out.println("It's the same instance !");
        }

        VehicleFactory factory = VehicleFactory.getInstance();

        IVehicleFactory car = factory.getVehicle("Car");
        car.createVehicle(IVehicleFactory.ModelVehicle.SEAT, IVehicleFactory.MotorVehicle.DIESEL, IVehicleFactory.ColorVehicle.BLACK);
        car.createVehicle(IVehicleFactory.ModelVehicle.BMW, IVehicleFactory.MotorVehicle.GASOIL, IVehicleFactory.ColorVehicle.BLUE);
        car.showAllVehicles();

        IVehicleFactory motorBike = factory.getVehicle("MotorBike");
        motorBike.createVehicle(IVehicleFactory.ModelVehicle.YAMAHA, IVehicleFactory.MotorVehicle.GASOIL, IVehicleFactory.ColorVehicle.RED);
        motorBike.showAllVehicles();

        IVehicleFactory airplane = factory.getVehicle("AirPlane");
        airplane.createVehicle(IVehicleFactory.ModelVehicle.AIRBUS, IVehicleFactory.MotorVehicle.DIESEL, IVehicleFactory.ColorVehicle.YELLOW);
        airplane.createVehicle(IVehicleFactory.ModelVehicle.BOING, IVehicleFactory.MotorVehicle.DIESEL, IVehicleFactory.ColorVehicle.BLACK);
        airplane.showAllVehicles();

        IVehicleFactory car2 = factory.getVehicle("Car");

        if(car == car2)
        {
            System.out.println("It's the same instance !");
        }

        s1.readDocuments("mydocument", "es_ES");

        s1.readDocuments("mydocument", "en_EN");

    }
}
