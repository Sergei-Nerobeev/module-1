package hu.nero.homeworks.calculator;


import hu.nero.homeworks.calculator.entity.Ham;
import hu.nero.homeworks.calculator.entity.Neck;
import hu.nero.homeworks.calculator.entity.Sausage;

public class Calculator {
	Product product;
	Sausage sausage;
	Ham ham;
	Neck neck;


	public void getCalculator() {
    Sausage sausage = new Sausage("Sausage", 800,412,1800);
		Ham ham = new Ham("Ham",350,275, 8511);
		Neck neck = new Neck("Neck",500,299,6988);
		sausage.getCost("Sausage", 1800);
		sausage.profitBeforeTax();
		sausage.profitAfterTax();

	}
}
