import java.util.ArrayList;

public class Garage {
    private AbstractVehicleFactory vehicleFactory;
    private final ArrayList<Vehicle> vehicles;

    public Garage() {
        this.vehicles = new ArrayList<>();
    }

    public void choose(AbstractVehicleFactory vehicleFactory) {
        this.vehicleFactory = vehicleFactory;
    }

    public void order(String vehicleType) {
        Vehicle vehicle = vehicleFactory.create(vehicleType);
        vehicles.add(vehicle);
    }

    public ArrayList<Vehicle> getVehicles() {
        return vehicles;
    }
}
