import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GarageTest {
    private Garage garage;

    @BeforeEach
    void setUpGarage() {
        garage = new Garage();
    }

    @Nested
    class CarsInGarageTest {
        @BeforeEach
        void setUpCarFactory() {
            CarFactory carFactory = new CarFactory();
            garage.choose(carFactory);
        }

        @Test
        void shouldBeAbleToPlaceTataCarInsideGarage() {
            garage.order(CAR_TYPE.TATA);
            ArrayList<Vehicle> vehicles = garage.getVehicles();
            Vehicle tataCar = vehicles.get(0);

            assertEquals(CAR_TYPE.TATA, tataCar.getName());
        }

        @Test
        void shouldBeAbleToPlaceSuzukiCarInsideGarage() {
            garage.order(CAR_TYPE.SUZUKI);
            ArrayList<Vehicle> vehicles = garage.getVehicles();
            Vehicle suzukiCar = vehicles.get(0);

            assertEquals(CAR_TYPE.SUZUKI, suzukiCar.getName());
        }
    }

    @Nested
    class BikesInGarageTest {
        @BeforeEach
        void setUpBikeFactory() {
            BikeFactory bikeFactory = new BikeFactory();
            garage.choose(bikeFactory);
        }

        @Test
        void shouldBeAbleToPlaceHeroBikeInsideGarage() {
            garage.order(BIKE_TYPE.HERO);
            ArrayList<Vehicle> vehicles = garage.getVehicles();
            Vehicle heroBike = vehicles.get(0);

            assertEquals(BIKE_TYPE.HERO, heroBike.getName());
        }

        @Test
        void shouldBeAbleToPlaceBajajBikeInsideGarage() {
            garage.order(BIKE_TYPE.BAJAJ);
            ArrayList<Vehicle> vehicles = garage.getVehicles();
            Vehicle bajajBike = vehicles.get(0);

            assertEquals(BIKE_TYPE.BAJAJ, bajajBike.getName());
        }
    }
}
