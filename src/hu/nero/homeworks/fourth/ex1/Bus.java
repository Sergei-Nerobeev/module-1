package hu.nero.homeworks.fourth.ex1;

public class Bus extends Car{
	public Bus(boolean condition, int maxPassengerCapacity, double width, double height, double length) {
		super(condition, maxPassengerCapacity, width, height, length);
	}
	public Bus( double width, double height, double length) {
		super(width, height, length);
	}
}
