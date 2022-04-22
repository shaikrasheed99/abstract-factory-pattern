public class BikeFactory implements AbstractVehicleFactory {
    @Override
    public Vehicle create(String vehicleType) {
        if (vehicleType.equalsIgnoreCase("hero")) {
            return new Hero(vehicleType);
        } else if (vehicleType.equalsIgnoreCase("bajaj")) {
            return new Bajaj(vehicleType);
        }
        return null;
    }
}
