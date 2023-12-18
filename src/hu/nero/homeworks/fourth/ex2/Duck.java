package hu.nero.homeworks.fourth.ex2;

public class Duck implements Flyable
{
  private int isInjured = 0;

  public Duck(int isInjured)
  {
    this.isInjured = isInjured;
  }

  @Override
  public String toString()
  {
    return "Duck is injured";
  }

  public void canFly() throws FlyException
  {
    if (isInjured > 0)
    {
      throw new FlyException();
    }
    else
    {
      System.out.println("Waiting: Duck flying");
    }
  }
}
