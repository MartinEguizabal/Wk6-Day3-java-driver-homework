import static org.junit.Assert.*;
import org.junit.*;
import driver_management.*;

public class DriverTest {

  Driver driver;
  DodgemCar dodgemcar;
  QuadBike quadbike;

  @Before
  public void before(){
    quadbike = new QuadBike(150, 150);
    dodgemcar = new DodgemCar(120, 2);
    driver = new Driver("Mad Max", dodgemcar);
  }

  @Test
  public void driveDistanceReturnsTime() {
    assertEquals(10, driver.transportDriveTime(1200));
  }

  @Test
  public void checkSetTransport() {
    driver.setTransport(quadbike);
    assertEquals(6, driver.transportDriveTime(900));
  }

}