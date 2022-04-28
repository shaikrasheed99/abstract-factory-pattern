import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CarFactoryTest {
    private CarFactory carFactory;

    @BeforeEach
    void setUpCarFactory() {
        carFactory = new CarFactory();
    }

    @Test
    void shouldBeAbleToCreateTATACar() {
        Vehicle tata = carFactory.createVehicleWithType(CAR_TYPE.TATA);

        assertTrue(tata instanceof Tata);
    }

    @Test
    void shouldBeAbleToCreateSUZUKICar() {
        Vehicle suzuki = carFactory.createVehicleWithType(CAR_TYPE.SUZUKI);

        assertTrue(suzuki instanceof Suzuki);
    }

    @Test
    void shouldNotBeAbleToCreateAnyVehicleWithNoInput() {
        assertNull(carFactory.createVehicleWithType(null));
    }
}
