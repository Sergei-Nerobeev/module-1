package hu.nero.homeworks.fourth.ex1;

public class Passengercar extends Car
{
  private boolean cruiseControl;

  protected Passengercar(boolean isClean, double width, double height, double length, boolean cruiseControl)
  {
    super(isClean, width, height, length);
    this.cruiseControl = cruiseControl;
  }
}
