import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class BikeFactoryTest {
    private BikeFactory bikeFactory;

    @BeforeEach
    void setUpBikeFactory() {
        bikeFactory = new BikeFactory();
    }

    @Test
    void shouldBeAbleToCreateHeroBike() {
        Vehicle hero = bikeFactory.createVehicleWithType(BIKE_TYPE.HERO);

        assertTrue(hero instanceof Hero);
    }
}
