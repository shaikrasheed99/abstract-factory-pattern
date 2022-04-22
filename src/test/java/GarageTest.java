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
        Vehicle heroBike = vehicles.get(0);

        assertEquals("hero", heroBike.getName());
    }

    @Test
    void shouldBeAbleToPlaceBajajBikeInsideGarage() {
        Garage garage = new Garage();
        BikeFactory bikeFactory = new BikeFactory();

        garage.choose(bikeFactory);
        garage.order("bajaj");
        ArrayList<Vehicle> vehicles = garage.getVehicles();
        Vehicle bajajBike = vehicles.get(0);

        assertEquals("bajaj", bajajBike.getName());
    }

    @Test
    void shouldBeAbleToPlaceTataCarInsideGarage() {
        Garage garage = new Garage();
        CarFactory carFactory = new CarFactory();

        garage.choose(carFactory);
        garage.order("tata");
        ArrayList<Vehicle> vehicles = garage.getVehicles();
        Vehicle tataCar = vehicles.get(0);

        assertEquals("tata", tataCar.getName());
    }

    @Test
    void shouldBeAbleToPlaceSuzukiCarInsideGarage() {
        Garage garage = new Garage();
        CarFactory carFactory = new CarFactory();

        garage.choose(carFactory);
        garage.order("suzuki");
        ArrayList<Vehicle> vehicles = garage.getVehicles();
        Vehicle suzukiCar = vehicles.get(0);

        assertEquals("suzuki", suzukiCar.getName());
    }
}
