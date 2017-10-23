public class BusStop {
  private String name;
  private Person[] peopleWaiting;

  public BusStop(String name) {
    this.name = name;
    this.peopleWaiting = new Person[5];
  }

  public int passengerCount() {
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
      int passengerCount = passengerCount();
      this.peopleWaiting[passengerCount] = person;
    }
  }

  public boolean stopFull() {
    return passengerCount() == this.peopleWaiting.length;
  }

  public boolean stopEmpty() {
    return passengerCount() < 1;
  }

  public void remove() {
    if (!stopEmpty()) {
      int passengerCount = passengerCount();
      this.peopleWaiting[passengerCount - 1] = null;
    }
  }

  public void movePassengerToBus() {
    if (!busFull()){
  
  }

}
