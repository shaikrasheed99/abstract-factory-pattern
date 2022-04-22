import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GarageTest {
    @Test
    void shouldBeAbleToAddHeroBikeInsideGarage() {
        Garage garage = new Garage();
        BikeFactory bikeFactory = new BikeFactory();

        garage.choose(bikeFactory);
        garage.order("hero");
        ArrayList<Vehicle> vehicles = garage.getVehicles();
        Vehicle hero = vehicles.get(0);

        assertEquals("hero", hero.getName());
    }

    @Test
    void shouldBeAbleToAddBajajBikeInsideGarage() {
        Garage garage = new Garage();
        BikeFactory bikeFactory = new BikeFactory();

        garage.choose(bikeFactory);
        garage.order("bajaj");
        ArrayList<Vehicle> vehicles = garage.getVehicles();
        Vehicle bajaj = vehicles.get(0);

        assertEquals("bajaj", bajaj.getName());
    }
}
