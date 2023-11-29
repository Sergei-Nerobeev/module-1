package hu.nero.homeworks.calulator2;

public class ProfitCalculator {

		public static void main(String[] args) {

				Product sausage = new Product("Колбаса", 800, 412, 408, 404);
				Product ham = new Product("Ветчина", 350, 275, 0, 0);
				Product neck = new Product("Шейка", 500, 311, 299, 299);

				int sausageWeight = 2000;
				int hamWeight = 8511;
				int neckWeight = 6988;

				double totalRevenue = sausage.calculateRevenue(sausageWeight) + ham.calculateRevenue(hamWeight) +
						neck.calculateRevenue(neckWeight);

				double totalCost = sausage.calculateCost(sausageWeight) + ham.calculateCost(hamWeight) +
						neck.calculateCost(neckWeight) + 1_000_000;

				double profitBeforeTax = totalRevenue - totalCost;

				double tax = calculateTax(profitBeforeTax);

				double netProfit = profitBeforeTax - tax;

				System.out.println("Итоговый доход: " + totalRevenue);
				System.out.println("Итоговый расход: " + totalCost);
				System.out.println("Итоговая прибыль до налогов: " + profitBeforeTax);
				System.out.println("Налог: " + tax);
				System.out.println("Прибыль после налогов: " + netProfit);
		}

		private static double calculateTax(double profitBeforeTax) {
				double tax = 0;

				if (profitBeforeTax > 2_000_000) {
						tax += (profitBeforeTax - 2_000_000) * 0.13;
						profitBeforeTax = 2_000_000;
				}

				if (profitBeforeTax > 1_000_000) {
						tax += (profitBeforeTax - 1_000_000) * 0.1;
						profitBeforeTax = 1_000_000;
				}

				tax += profitBeforeTax * 0.08;

				return tax;
		}
}

