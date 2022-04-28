import org.junit.jupiter.api.Test;

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
}