public class BusStop {
  private String name;
  private Person[] peopleWaiting;

  public BusStop(String name) {
    this.name = name;
    this.peopleWaiting = new Person[5];
  }

  public int stopPassengerCount() {
    int counter = 0;
    for (Person person : this.peopleWaiting) {
      if (person != null) {
        counter++;
      }
    }
    return counter;
  }

  public void add(Person person) {
    if (!stopFull()){
      int stopPassengerCount = stopPassengerCount();
      this.peopleWaiting[stopPassengerCount] = person;
    }
  }

  public boolean stopFull() {
    return stopPassengerCount() == this.peopleWaiting.length;
  }

  public boolean stopEmpty() {
    return stopPassengerCount() < 1;
  }

  public void remove() {
    if (!stopEmpty()) {
      int stopPassengerCount = stopPassengerCount();
      this.peopleWaiting[stopPassengerCount - 1] = null;
    }
  }

  public void movePassengerToBus(Bus bus, Person person) {
    for (int i=0; i < peopleWaiting.length; i++) {
      if (!bus.busFull() && !this.stopEmpty()){
        bus.add(person);
        this.remove();
      }
    }
  }

}
