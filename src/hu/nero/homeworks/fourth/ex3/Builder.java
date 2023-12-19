package hu.nero.homeworks.fourth.ex3;

public class Builder extends Human implements Soundable
{
  @Override
  public void saySomething()
  {
    System.out.print("Я - строитель! ");
    super.saySomething();
  }
}
