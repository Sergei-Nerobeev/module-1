package hu.nero.homeworks.fourth.ex1;

public class Carwash
{
  private static final int WASH_COST = 2000;
  private static final String DISPLAY_INFO = "Мэрия заплатит на мойку автомобилей: ";

  public int getWashCar(Car car)
  {
    if (car.getLength() > 6 || car.getHeight() > 2.5 || car.getWidth() > 2)
    {
      System.out.println(getWashCost() * 2);
    }
    else
    {
      System.out.println(getWashCost());
    }
    return WASH_COST;
  }

  public void getWashCars(Car[] cars, int washCost)
  {
    int washCount = 0;
    for (int i = 0; i < cars.length; i++)
    {
      washCount++;
    }
    System.out.println(DISPLAY_INFO + washCount * washCost);
  }

  public int getWashCost()
  {
    return WASH_COST;
  }

}
