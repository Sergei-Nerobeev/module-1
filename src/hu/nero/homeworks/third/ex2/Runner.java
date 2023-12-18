package hu.nero.homeworks.third.ex2;

public class Runner
{
  public static void main(String[] args)
  {
    Factory factory = new Factory();
    Smartphone samsungGalaxy = factory.createSamsungGalaxy();
    Smartphone iphone15 = factory.createIPhone15();
    samsungGalaxy.printDetails();
    System.out.println();
    iphone15.printDetails();

  }
}
