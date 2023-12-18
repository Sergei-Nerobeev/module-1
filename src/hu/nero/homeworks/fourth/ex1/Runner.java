package hu.nero.homeworks.fourth.ex1;

public class Runner
{
  public static void main(String[] args)
  {
    Passengercar passengercar = new Passengercar(true, true, 1.8, 2, 5);
    Bus bus = new Bus(2.3, 3, 12);
    Carwash carwash = new Carwash();
    int total = carwash.getWashCar(passengercar);
    carwash.getWashCar(bus);
    Car[] cars = {
        new Passengercar(true, true, 1.8, 2, 5),
        new Passengercar(true, true, 1.8, 2, 5),
        new Passengercar(true, true, 1.8, 2, 5),
        new Passengercar(true, true, 1.8, 2, 5),
        new Passengercar(true, true, 1.8, 2, 5),
        new Bus(2.3, 3, 12),
        new Bus(2.3, 3, 12),
        new Bus(2.3, 3, 12),
        new Bus(2.3, 3, 12),
        new Bus(2.3, 3, 12)
    };
    carwash.getWashCars(cars, total);

  }
}
