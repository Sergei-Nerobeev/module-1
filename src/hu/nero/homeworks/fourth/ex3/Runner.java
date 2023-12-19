package hu.nero.homeworks.fourth.ex3;

public class Runner
{
  public static void main(String[] args)
  {
    Soundable[] sounds = {
        new Human(),
        new Builder(),
        new Driver(),
        new Bird()
    };
    for (Soundable soundAround : sounds)
    {
      soundAround.saySomething();
    }
  }
}
