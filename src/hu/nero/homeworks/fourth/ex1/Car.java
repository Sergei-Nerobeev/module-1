package hu.nero.homeworks.fourth.ex1;

public abstract class Car {
	private boolean condition;
	private int maxPassengerCapasity;
	private boolean cruiseControl;
	private double width;
	private double height;
	private double lenght;

	public Car(boolean condition, int maxPassengerCapacity, double width, double height, double length) {
		this.condition = condition;
		this.maxPassengerCapasity = maxPassengerCapacity;
		this.width = width;
		this.height = height;
		this.lenght = length;
	}

	public Car(boolean condition, boolean cruiseControl, double width, double height, double length) {
		this.condition = condition;
		this.cruiseControl = cruiseControl;
		this.width = width;
		this.height = height;
		this.lenght = length;
	}

	public Car(double width, double height, double lenght) {
		this.width = width;
		this.height = height;
		this.lenght = lenght;
	}

	public boolean isCondition() {
		return condition;
	}

	public int getMaxPassengerCapasity() {
		return maxPassengerCapasity;
	}

	public boolean isCruiseControl() {
		return cruiseControl;
	}

	public double getWidth() {
		return width;
	}

	public double getHeight() {
		return height;
	}

	public double getLength() {
		return lenght;
	}

	@Override
	public String toString() {
		return "Car{" +
				"condition=" + condition +
				", maxPassengerCapasity=" + maxPassengerCapasity +
				", cruiseControl=" + cruiseControl +
				", width=" + width +
				", height=" + height +
				", length=" + lenght +
				'}';
	}
}
