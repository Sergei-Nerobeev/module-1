package hu.nero.homeworks.fourth.ex1;

public class Carwash
{
  public int washCar(Car car)
  {
    car.setClean(true);
    return car.washCost();
  }

  public int washCars(Car[] cars)
  {
    int totalCostForWashing = 0;
    for (Car c : cars)
    {
      totalCostForWashing += c.washCost();
    }
    return totalCostForWashing;
  }

}
