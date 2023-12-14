import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class VehicleTest {

    @Test
    public void testCarIsVehicle() {
        Car car = new Car("Toyota", "Camry", 2020);
        assertTrue(car instanceof Vehicle);
    }

    @Test
    public void testCarNumWheels() {
        Car car = new Car("Toyota", "Camry", 2020);
        assertEquals(4, car.getNumWheels());
    }

    @Test
    public void testMotorcycleNumWheels() {
        Motorcycle motorcycle = new Motorcycle("Honda", "CBR600RR", 2019);
        assertEquals(2, motorcycle.getNumWheels());
    }

    @Test
    public void testCarSpeedAfterTestDrive() {
        Car car = new Car("Toyota", "Camry", 2020);
        car.testDrive();
        assertEquals(60, car.getSpeed());
    }

    @Test
    public void testMotorcycleSpeedAfterTestDrive() {
        Motorcycle motorcycle = new Motorcycle("Honda", "CBR600RR", 2019);
        motorcycle.testDrive();
        assertEquals(75, motorcycle.getSpeed());
    }

    @Test
    public void testCarSpeedAfterPark() {
        Car car = new Car("Toyota", "Camry", 2020);
        car.testDrive();
        car.park();
        assertEquals(0, car.getSpeed());
    }

    @Test
    public void testMotorcycleSpeedAfterPark() {
    Motorcycle motorcycle = new Motorcycle("Honda", "CBR600RR", 2019);
        motorcycle.testDrive();
        motorcycle.park();
        assertEquals(0, motorcycle.getSpeed());
    }
}