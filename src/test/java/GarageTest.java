import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertTrue;

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
            garage.chooseFactory(carFactory);
        }

        @Test
        void shouldBeAbleToPlaceTataCarInsideGarage() {
            garage.orderVehicleWithType(CAR_TYPE.TATA);
            ArrayList<Vehicle> vehicles = garage.getVehicles();
            Vehicle tataCar = vehicles.get(0);

            assertTrue(tataCar instanceof Tata);
        }

        @Test
        void shouldBeAbleToPlaceSuzukiCarInsideGarage() {
            garage.orderVehicleWithType(CAR_TYPE.SUZUKI);
            ArrayList<Vehicle> vehicles = garage.getVehicles();
            Vehicle suzukiCar = vehicles.get(0);

            assertTrue(suzukiCar instanceof Suzuki);
        }
    }

    @Nested
    class BikesInGarageTest {
        @BeforeEach
        void setUpBikeFactory() {
            BikeFactory bikeFactory = new BikeFactory();
            garage.chooseFactory(bikeFactory);
        }

        @Test
        void shouldBeAbleToPlaceHeroBikeInsideGarage() {
            garage.orderVehicleWithType(BIKE_TYPE.HERO);
            ArrayList<Vehicle> vehicles = garage.getVehicles();
            Vehicle heroBike = vehicles.get(0);

            assertTrue(heroBike instanceof Bike);
        }

        @Test
        void shouldBeAbleToPlaceBajajBikeInsideGarage() {
            garage.orderVehicleWithType(BIKE_TYPE.BAJAJ);
            ArrayList<Vehicle> vehicles = garage.getVehicles();
            Vehicle bajajBike = vehicles.get(0);

            assertTrue(bajajBike instanceof Bajaj);
        }
    }
}
