public class Car implements Vehicle {
    private final String name;

    public Car(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}
