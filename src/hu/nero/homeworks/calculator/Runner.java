package hu.nero.homeworks.calculator;

import hu.nero.homeworks.calculator.entity.Ham;
import hu.nero.homeworks.calculator.entity.Neck;
import hu.nero.homeworks.calculator.entity.Sausage;

public class Runner {
	public static void main(String[] args) {

		Sausage sausage = new Sausage("Sausage", 800,408,2000);
//		Ham ham = new Ham("Ham",350,275, 8511);
//		Neck neck = new Neck("Neck",500,299,6988);

//		sausage.profitBeforeTax();
//		ham.profitBeforeTax();
//		neck.profitBeforeTax();

		sausage.profitAfterTax();

	}
}
