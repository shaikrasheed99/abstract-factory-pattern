public class BikeFactory implements AbstractVehicleFactory {
    @Override
    public Vehicle createVehicleWithType(VehicleType vehicleType) {
        if (vehicleType == BIKE_TYPE.HERO) {
            return new Hero(vehicleType);
        } else if (vehicleType == BIKE_TYPE.BAJAJ) {
            return new Bajaj(vehicleType);
        }
        return null;
    }
}
