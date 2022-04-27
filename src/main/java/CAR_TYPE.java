public enum CAR_TYPE implements VehicleType{
    TATA("tata"), SUZUKI("suzuki");

    private final String type;

    private CAR_TYPE(String type) {
        this.type = type;
    }
}
