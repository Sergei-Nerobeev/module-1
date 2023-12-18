package hu.nero.homeworks.third.ex2;

public class Factory
{
  public Smartphone createSamsungGalaxy()
  {
    Smartphone samsungGalaxy = new Smartphone("Samsung Galaxy");
    samsungGalaxy.buildSmartPhone(
        new Os("Android"),
        new Board("j-108", 10, 12, 13),
        new Camera("Camera Samsung", 20, false)
    );
    return samsungGalaxy;
  }

  public Smartphone createIPhone15()
  {
    Smartphone iphone15 = new Smartphone("Phone 15");
    iphone15.buildSmartPhone(
        new Os("Ios"),
        new Board("7uik", 15, 12, 13),
        new Camera("Camera Iphone", 15, true)
    );
    return iphone15;
  }

}

