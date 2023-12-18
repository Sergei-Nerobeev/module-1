package hu.nero.homeworks.fourth.ex2;

public class Runner
{
  public static void main(String[] args) throws FlyException
  {
    Flyable[] flyable = {
        new Duck(0),
        new Duck(1),
        new Plane(-1),
        new Plane(10)
    };
    for (Flyable fly : flyable)
    {
      try
      {
        fly.canFly();
      }
      catch (FlyException exception)
      {
        exception.printFlyException(fly);
      }

    }

  }
}
