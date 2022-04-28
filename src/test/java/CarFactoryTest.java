import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CarFactoryTest {
    @Test
    void shouldBeAbleToCreateTATACar() {
        CarFactory carFactory = new CarFactory();

        Vehicle tata = carFactory.createVehicleWithType(CAR_TYPE.TATA);

        assertTrue(tata instanceof Tata);
    }

    @Test
    void shouldBeAbleToCreateSUZUKICar() {
        CarFactory carFactory = new CarFactory();

        Vehicle suzuki = carFactory.createVehicleWithType(CAR_TYPE.SUZUKI);

        assertTrue(suzuki instanceof Suzuki);
    }

    @Test
    void shouldNotBeAbleToCreateAnyVehicleWithNoInput() {
        CarFactory carFactory = new CarFactory();

        assertNull(carFactory.createVehicleWithType(null));
    }
}
