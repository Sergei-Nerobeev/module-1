package hu.nero.homeworks.fourth.ex1;

public abstract class Car
{
  private boolean clearCondition;
  private int maxPassengerCapacity;
  private boolean cruiseControl;
  private double width;
  private double height;
  private double length;

  protected Car(boolean clearCondition, int maxPassengerCapacity, double width, double height, double length)
  {
    this.clearCondition = clearCondition;
    this.maxPassengerCapacity = maxPassengerCapacity;
    this.width = width;
    this.height = height;
    this.length = length;
  }

  protected Car(boolean clearCondition, boolean cruiseControl, double width, double height, double length)
  {
    this.clearCondition = clearCondition;
    this.cruiseControl = cruiseControl;
    this.width = width;
    this.height = height;
    this.length = length;
  }

  protected Car(double width, double height, double length)
  {
    this.width = width;
    this.height = height;
    this.length = length;
  }

  public double getWidth()
  {
    return width;
  }

  public double getHeight()
  {
    return height;
  }

  public double getLength()
  {
    return length;
  }

}
