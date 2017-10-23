import static org.junit.Assert.assertEquals;
import org.junit.*;

public class BusTest {
  Bus bus;
  Person person;

  @Before
  public void before() {
    bus = new Bus("x1");
    person = new Person();
  }

  @Test
  public void hasName() {
    assertEquals("x1", bus.getName());
  }

  @Test
  public void busStartsEmpty() {
    assertEquals(0, bus.passengerCount());
  }

  @Test
  public void canAddPassenger() {
    bus.add(person);
    assertEquals(1, bus.passengerCount());
  }

  @Test
  public void isBusFull() {
    for (int i=0; i < 10; i++) {
      bus.add(person);
    }
    assertEquals(true, bus.busFull());
  }

  @Test
  public void isBusNotFull() {
    for (int i=0; i < 8; i++) {
      bus.add(person);
    }
    assertEquals(false, bus.busFull());
  }

  @Test
  public void noAddIfFull() {
    for (int i=0; i < 15; i++) {
      bus.add(person);
    }
    assertEquals(10, bus.passengerCount());
  }

  @Test
  public void reachedTerminal() {
    bus.add(person);
    bus.disembark();
    assertEquals(0, bus.passengerCount());
  }

}
