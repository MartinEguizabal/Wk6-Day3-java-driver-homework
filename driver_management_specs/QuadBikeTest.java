import static org.junit.Assert.*;
import org.junit.*;
import driver_management.*;

public class QuadBikeTest {

  QuadBike quadbike;

  @Before
  public void before(){
    quadbike = new QuadBike(200, 160);
  }

  @Test
  public void driveDistanceReturnsTime() {
    assertEquals(5, quadbike.driveTime(1000));
  }

  @Test
  public void hasEngineCCs(){
    assertEquals(160, quadbike.getEngineCCs());
  }
}