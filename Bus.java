public class Bus {
  private String name;
  private Person[] passengers;
  
  public Bus(String name) {
    this.name = name;
    this.passengers = new Person[10];
  }

  public String getName() {
    return this.name;
  }

  public int passengerCount() {
    int counter = 0;
    for (Person person : this.passengers) {
      if (person != null) {
        counter++;
      }
    }
    return counter;
  }

  public void add(Person person) {
    if (!busFull()){
      int passengerCount = passengerCount();
      this.passengers[passengerCount] = person;
    }
  }

  public boolean busFull() {
    return passengerCount() == this.passengers.length;
  }

  public void disembark() {
    for (int i = 0; i < this.passengers.length; i++) {
      passengers[i] = null;
    }
  }

}
