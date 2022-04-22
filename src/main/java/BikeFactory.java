public class BikeFactory implements AbstractVehicleFactory {
    @Override
    public Vehicle create(String vehicleType) {
        if (vehicleType.equalsIgnoreCase("hero")) {
            return new Hero(vehicleType);
        }
        return null;
    }
}
