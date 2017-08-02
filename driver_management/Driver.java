package driver_management;
import behaviours.*;

public class Driver {
  String name;
  private Driveable transport;

  public Driver(String name, Driveable transport){
    this.name = name;
    this.transport = transport;
  }

  public int transportDriveTime(int distance) {
    return this.transport.driveTime(distance);
  }

  public void setTransport(Driveable newTransport){
    this.transport = newTransport;
  }


}