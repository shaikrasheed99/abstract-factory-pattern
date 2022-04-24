import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GarageTest {
    private Garage garage;

    @BeforeEach
    void setUpGarage() {
        garage = new Garage();
    }
    @Test
    void shouldBeAbleToPlaceHeroBikeInsideGarage() {
        BikeFactory bikeFactory = new BikeFactory();

        garage.choose(bikeFactory);
        garage.order("hero");
        ArrayList<Vehicle> vehicles = garage.getVehicles();
        Vehicle heroBike = vehicles.get(0);

        assertEquals("hero", heroBike.getName());
    }

    @Test
    void shouldBeAbleToPlaceBajajBikeInsideGarage() {
        BikeFactory bikeFactory = new BikeFactory();

        garage.choose(bikeFactory);
        garage.order("bajaj");
        ArrayList<Vehicle> vehicles = garage.getVehicles();
        Vehicle bajajBike = vehicles.get(0);

        assertEquals("bajaj", bajajBike.getName());
    }

    @Test
    void shouldBeAbleToPlaceTataCarInsideGarage() {
        CarFactory carFactory = new CarFactory();

        garage.choose(carFactory);
        garage.order("tata");
        ArrayList<Vehicle> vehicles = garage.getVehicles();
        Vehicle tataCar = vehicles.get(0);

        assertEquals("tata", tataCar.getName());
    }

    @Test
    void shouldBeAbleToPlaceSuzukiCarInsideGarage() {
        CarFactory carFactory = new CarFactory();

        garage.choose(carFactory);
        garage.order("suzuki");
        ArrayList<Vehicle> vehicles = garage.getVehicles();
        Vehicle suzukiCar = vehicles.get(0);

        assertEquals("suzuki", suzukiCar.getName());
    }
}
