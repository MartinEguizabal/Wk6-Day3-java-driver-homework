package driver_management;
import behaviours.*;

public class BoxCar extends Vehicle implements Driveable {

  private String colour;
  private String name;

  public BoxCar(int averageSpeed, String colour, String name) {
    super(averageSpeed);
    this.colour = colour;
    this.name = name;
  }

  public String getColour(){
    return this.colour;
  }

  public String getName(){
    return this.name;
  }
}