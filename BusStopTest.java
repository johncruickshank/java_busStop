import static org.junit.Assert.assertEquals;
import org.junit.*;

public class BusStopTest {
  Bus bus;
  Person person;
  BusStop busStop;

  @Before
  public void before() {
    bus = new Bus("x1");
    person = new Person();
    busStop = new BusStop("Stepps");
  }

  @Test
  public void populateBusStop() {
    for (int i=0; i < 5; i++) {
      busStop.add(person);
    }
    assertEquals(5, busStop.stopPassengerCount());
  }

  @Test
  public void removePassenger() {
    for (int i=0; i < 5; i++) {
      busStop.add(person);
    }
    busStop.remove();
    assertEquals(4, busStop.stopPassengerCount());
  }

  @Test
  public void passengerGetOnBus() {
    for (int i=0; i < 5; i++) {
      busStop.add(person);
    }
    busStop.movePassengerToBus(bus, person);
    assertEquals(0, busStop.stopPassengerCount());
    assertEquals(5, bus.passengerCount());
  }

}
