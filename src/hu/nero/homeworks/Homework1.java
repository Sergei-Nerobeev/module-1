package hu.nero.homeworks;

import java.util.Locale;

import static hu.nero.homeworks.Homework1.ProfitCalculator.calculateProfitAfterTax;

public class Homework1 {
		public static void main(String[] args) {
				ex1();
				ex2();
				ex3();
				ex4();
		}

		public static void ex1() {
				//Дана строка
				String name = "     ПЕтРов Олег Иванович     ";
				//Необходимо
				//1. убрать лишние пробелы,
				System.out.println(name.trim());
				//2. перевести текст в верхний регистр
				System.out.println(name.toUpperCase(Locale.ROOT).trim());
				//3. Если содержит "ова ", то печатаем на экран: Уважаемая {name}
				if (name.contains("ова ")) {
						System.out.println("Уважаемая " + name);
						// Если содержит "ов ", то печатаем на экран: Уважаемый {name}
				} else if (name.contains("ов ")) {
						System.out.println("Уважаемый " + name.toUpperCase(Locale.ROOT).trim());
						// В иных случаях печатаем на экран: Неизвестное лицо {name}
				} else {
						System.out.println("Неизвестное лицо " + name);
				}

		}

		public static void ex2() {
				//У нас есть машина. В данной машине есть перечень проверок, перед запуском
				//Количество топлива
				double fuel = 10;
				//Проверка двигателя
				boolean isEngineWork = true;
				//Проверка отсутствия ошибок (false - ошибок нет)
				boolean hasErrors = false;
				//Датчики давления шин
				boolean isWheelWork1 = true;
				boolean isWheelWork2 = true;
				boolean isWheelWork3 = true;
				boolean isWheelWork4 = true;

				//Поменять(убрать, поставить) логические операторы так, чтобы машина запускалась:
				// когда топлива не меньше 10 литров, двигатель работает, колеса все работают, нет ошибок
				//В ином случае, машина не должна запускаться

				if ((fuel >= 10 && isEngineWork) && (isWheelWork1 && isWheelWork2 && isWheelWork3 && isWheelWork4)
						|| hasErrors) {
						System.out.println("Машина работает");
				} else {
						System.out.println("Машина не работает");
				}
		}

		public static void ex3() {
				//Работа на самостоятельное изучение методов.
				//Заменить в строке все 'this is' на 'those are', получить индекс (число) второй буквы 'о' в строке
				//Печать полученного индекса
				String simply = "this is simply. This is my favorite song.";

				String modeString1 = simply.replaceAll("this is", "those are");
				String modeString2 = modeString1.replaceAll("This is", "those are");
				System.out.println(modeString2);

				int indexSecondO = modeString2.indexOf("o", modeString2.indexOf("o") + 1);
				System.out.println(indexSecondO);
		}

		public static void ex4() {

				int sausageQty = 2000;
				int hamQty = 8511;
				int neckQty = 6988;
				double resultProfit = calculateProfitAfterTax(sausageQty, hamQty, neckQty);
				System.out.println("Прибыль после налогов: " + resultProfit + " руб.");
		}

		static class ProfitCalculator {
				private static int sausagePrice = 800;
				private static int sausageCost1 = 412;
				private static int sausageCost2 = 408;
				private static int sausageCost3 = 404;

				private static int hamPrice = 350;
				private static int hamCost = 275;

				private static int neckPrice = 500;
				private static int neckCost1 = 311;
				private static int neckCost2 = 299;

				public static double calculateProfitAfterTax(int sausageQty, int hamQty, int neckQty) {


						int totalIncome = (sausageQty * sausagePrice) + (hamQty * hamPrice) + (neckQty * neckPrice);
						int totalExpense = (
								(sausageQty * (sausageQty < 1000 ? sausageCost1 : (sausageQty < 2000 ? sausageCost2 : sausageCost3))) +
										(hamQty * hamCost) +
										(neckQty * (neckQty < 500 ? neckCost1 : neckCost2)) +
										1000000
						);

						int profitBeforeTax = totalIncome - totalExpense;
						double taxRate1 = 0.08;
						double taxRate2 = 0.1;
						double taxRate3 = 0.13;
						double tax = 0;

						if (profitBeforeTax > 2000000) {
								tax = 2000000 * taxRate1 + (profitBeforeTax - 2000000) * taxRate2;
						} else if (profitBeforeTax > 1000000) {
								tax = profitBeforeTax * taxRate2;
						} else {
								tax = profitBeforeTax * taxRate1;
						}

						int totalTax = (int) Math.round(tax);
						double profitAfterTax = profitBeforeTax - totalTax;

						return profitAfterTax;
				}

		}

}

