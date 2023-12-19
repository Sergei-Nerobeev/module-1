package hu.nero.homeworks.fourth.ex1;

public class Bus extends Car
{
  private int maxPassengerCapacity;

  protected Bus(boolean isClean, double width, double height, double length, int maxPassengerCapacity)
  {
    super(isClean, width, height, length);
    this.maxPassengerCapacity = maxPassengerCapacity;
  }

  @Override
  public int washCost()
  {
    return getLength() > 6 || getHeight() > 2.5 || getWidth() > 2 ? 4000 : 2000;
  }
}
