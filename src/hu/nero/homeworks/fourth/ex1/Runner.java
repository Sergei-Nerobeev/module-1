package hu.nero.homeworks.fourth.ex1;

public class Runner
{
  public static void main(String[] args)
  {
    Carwash carwash = new Carwash();
    Car[] cars = {
        new Passengercar(false, 1.8, 2, 5, true),
        new Passengercar(false, 1.8, 2, 5, true),
        new Passengercar(false, 1.8, 2, 5, true),
        new Passengercar(false, 1.8, 2, 5, true),
        new Bus(false, 2.3, 3, 12, 0),
        new Bus(false, 2.3, 3, 12, 0),
        new Bus(false, 2.3, 3, 12, 0),
        new Bus(false, 2.3, 3, 12, 0),
        new Bus(false, 2.3, 3, 12, 0),
        };

    int totalCost = carwash.washCars(cars);
    System.out.println("Мэрия заплатит на мойку автомобилей: " + totalCost);
  }
}
