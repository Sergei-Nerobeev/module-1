package hu.nero.homeworks.fourth.ex1;

public class Bus extends Car
{
  private int maxPassengerCapacity;

  protected Bus(boolean isClean, double width, double height, double length, int maxPassengerCapacity)
  {
    super(isClean, width, height, length);
    this.maxPassengerCapacity = maxPassengerCapacity;
  }
}
