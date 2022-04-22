public class Bike implements Vehicle {
    private final String name;

    public Bike(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}
