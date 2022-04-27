public class Bike implements Vehicle {
    private final VehicleType name;

    public Bike(VehicleType name) {
        this.name = name;
    }

    @Override
    public VehicleType getName() {
        return name;
    }
}
