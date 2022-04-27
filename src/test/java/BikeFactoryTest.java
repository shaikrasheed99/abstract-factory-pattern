import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class BikeFactoryTest {
    @Test
    void shouldBeAbleToCreateHeroBike() {
        BikeFactory bikeFactory = new BikeFactory();

        Vehicle hero = bikeFactory.createVehicleWithType(BIKE_TYPE.HERO);

        assertTrue(hero instanceof Hero);
    }
}
