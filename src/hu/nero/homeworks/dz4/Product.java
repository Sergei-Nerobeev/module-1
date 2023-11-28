package hu.nero.homeworks.dz4;

public class Product {

		private String name;
		private int price;
		private double costBelow2Kg;
		private double costFrom1To2Kg;
		private double costMore2Kg;

		public Product(String name, int price, double costBelow2Kg, double costFrom1To2Kg, double costMore2Kg) {
				this.name = name;
				this.price = price;
				this.costBelow2Kg = costBelow2Kg;
				this.costFrom1To2Kg = costFrom1To2Kg;
				this.costMore2Kg = costMore2Kg;
		}

		public double calculateCost(int weight) {
				if (weight < 1000) {
						return costBelow2Kg * weight;

				} else if (weight > 1000 && weight < 2000 ) {
						return costFrom1To2Kg * weight;

				} else {
						return costMore2Kg * weight;
				}
		}

		public double calculateRevenue(int weight) {
				return price * weight;
		}





}
