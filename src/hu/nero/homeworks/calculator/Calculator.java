package hu.nero.homeworks.calculator;


import hu.nero.homeworks.calculator.entity.Ham;
import hu.nero.homeworks.calculator.entity.Neck;
import hu.nero.homeworks.calculator.entity.Sausage;

public class Calculator {

	public void getCalculator() {
    Sausage sausage = new Sausage("Sausage", 800,412,1800);
		Ham ham = new Ham("Ham",350,275, 8511);
		Neck neck = new Neck("Neck",500,299,6988);

		int expense = sausage.getCost("Sausage", 5000);
		ham.getCost("Ham", 2000);
		neck.getCost("Neck", 1000);

	}
}
