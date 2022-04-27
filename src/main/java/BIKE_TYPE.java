public enum BIKE_TYPE implements VehicleType{
    HERO("hero"), BAJAJ("bajaj");

    private final String bikeType;

    private BIKE_TYPE(String bikeType) {
        this.bikeType = bikeType;
    }
}
