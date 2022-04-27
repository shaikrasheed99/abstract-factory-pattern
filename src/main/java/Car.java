public class Car implements Vehicle {
    private final VehicleType name;

    public Car(VehicleType name) {
        this.name = name;
    }

    @Override
    public VehicleType getName() {
        return name;
    }
}
