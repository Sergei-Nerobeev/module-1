package hu.nero.homeworks.third.ex1;

public abstract class Three {
protected int threeAge;

protected Three(int threeAge) {
	this.threeAge = threeAge;
}

public int getThreeAge() {
	return threeAge;
}

public void growThree() {
	threeAge++;
	System.out.println("Возраст дерева: " + threeAge);
}
}
