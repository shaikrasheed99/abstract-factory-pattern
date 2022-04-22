import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GarageTest {
    @Test
    void shouldBeAbleToPlaceHeroBikeInsideGarage() {
        Garage garage = new Garage();
        BikeFactory bikeFactory = new BikeFactory();

        garage.choose(bikeFactory);
        garage.order("hero");
        ArrayList<Vehicle> vehicles = garage.getVehicles();
        Vehicle hero = vehicles.get(0);

        assertEquals("hero", hero.getName());
    }

    @Test
    void shouldBeAbleToPlaceBajajBikeInsideGarage() {
        Garage garage = new Garage();
        BikeFactory bikeFactory = new BikeFactory();

        garage.choose(bikeFactory);
        garage.order("bajaj");
        ArrayList<Vehicle> vehicles = garage.getVehicles();
        Vehicle bajaj = vehicles.get(0);

        assertEquals("bajaj", bajaj.getName());
    }

    @Test
    void shouldBeAbleToPlaceTataCarInsideGarage() {
        Garage garage = new Garage();
        CarFactory carFactory = new CarFactory();

        garage.choose(carFactory);
        garage.order("tata");
        ArrayList<Vehicle> vehicles = garage.getVehicles();
        Vehicle tata = vehicles.get(0);

        assertEquals("tata", tata.getName());
    }
}
