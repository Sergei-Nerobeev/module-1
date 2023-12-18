package hu.nero.homeworks.fourth.ex2;

public class Plane implements Flyable
{
  private int countPassengers = 0;

  public Plane(int countPassengers)
  {
    this.countPassengers = countPassengers;
  }

  @Override
  public String toString()
  {
    return "Passengers on the airplane is less than 0";
  }

  public void canFly() throws FlyException
  {
    if (countPassengers < 0)
    {
      throw new FlyException();
    }
    else
    {
      System.out.println("Waiting: Plane flying");
    }
  }
}
