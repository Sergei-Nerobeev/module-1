package hu.nero.homeworks.fourth.ex1;

public class Carwash {
	private Car car;
 	private final int washCost = 2000;
	private final String displayInfoForOne = "Стоимость мойки за один автомобиль: ";
	private final String displayInfoTotal = "Стоимость мойки за автомобили: ";

	public int getWashCar(Car car){
		if(car.getLength() > 6 || car.getHeight() > 2.5 || car.getWidth() > 2) {
			System.out.println(displayInfoForOne + getWashCost() * 2);
		} else {
			System.out.println(displayInfoForOne + getWashCost());
		}
		return washCost;
	}
	public void getWashCars(Car[] cars, int washCost) {
		int washCount = 0;
		for (int i = 0; i < cars.length; i++) {
			washCount++;
		}
		System.out.println(displayInfoTotal + washCount + washCost);
	}

	public int getWashCost() {
		return washCost;
	}

	@Override
	public String toString() {
		return "Car wash{" +
				"car=" + car +
				", washCost=" + washCost +
				'}';
	}
}
