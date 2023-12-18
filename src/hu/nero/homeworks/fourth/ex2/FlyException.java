package hu.nero.homeworks.fourth.ex2;

public class FlyException extends Exception
{
  public void printFlyException(Flyable flyable)
  {
    System.out.println("Error: " + flyable);
  }
}
