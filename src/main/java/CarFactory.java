public class CarFactory implements AbstractVehicleFactory {
    @Override
    public Vehicle createVehicleWithType(VehicleType vehicleType) {
        if (vehicleType == CAR_TYPE.TATA) {
            return new Tata(vehicleType);
        } else if (vehicleType == CAR_TYPE.SUZUKI) {
            return new Suzuki(vehicleType);
        }
        return null;
    }
}
