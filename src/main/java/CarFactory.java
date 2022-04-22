public class CarFactory implements AbstractVehicleFactory {
    @Override
    public Vehicle create(String vehicleType) {
        if (vehicleType.equalsIgnoreCase("tata")) return new Tata(vehicleType);
        return null;
    }
}
