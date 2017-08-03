import static org.junit.Assert.*;
import org.junit.*;
import driver_management.*;

public class BoxCarTest {

  BoxCar boxcar;

  @Before
  public void before(){
    boxcar = new BoxCar(5, "red", "speedy");
  }
  
  @Test
  public void driveDistanceReturnsTime() {
    assertEquals(4, boxcar.driveTime(20));
  }

  @Test
  public void hasColour(){
    assertEquals("red", boxcar.getColour());
  }

  @Test
  public void hasName(){
    assertEquals("speedy", boxcar.getName());
  }
}