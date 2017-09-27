package edu.cnm.deepdive.inheritance;

public class CanisLupus extends Canis {

  public CanisLupus(String name, int weight) {
    super(name, weight);
}
  public void speak() {
    System.out.println(getName() + " howl!");
  }
  /* (non-Javadoc)
   * @see edu.cnm.deepdive.inheritance.Canis#hunt()
   */
  @Override
  public void hunt() {
    System.out.println(getName() + " hunts for food");
    
  }
}

