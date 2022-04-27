import java.util.ArrayList;

public class Garage {
    private final ArrayList<Vehicle> vehicles;
    private AbstractVehicleFactory vehicleFactory;

    public Garage() {
        this.vehicles = new ArrayList<>();
    }

    public void choose(AbstractVehicleFactory vehicleFactory) {
        this.vehicleFactory = vehicleFactory;
    }

    public void orderVehicleWithType(VehicleType vehicleType) {
        Vehicle vehicle = vehicleFactory.createVehicleWithType(vehicleType);
        vehicles.add(vehicle);
    }

    public ArrayList<Vehicle> getVehicles() {
        return vehicles;
    }
}
