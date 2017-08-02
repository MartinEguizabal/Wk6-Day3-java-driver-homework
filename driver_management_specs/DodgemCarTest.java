import static org.junit.Assert.*;
import org.junit.*;
import driver_management.*;

public class DodgemCarTest {

  DodgemCar car;

  @Before
  public void before(){
    car = new DodgemCar(100);
  }

  @Test
  public void driveDistanceReturnsTime() {
    assertEquals(1, car.driveTime(10));
  }
}