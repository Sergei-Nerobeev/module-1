package hu.nero.homeworks.third.ex5;

import java.util.Arrays;

public final class City {
		private final String nameOfCity;
		private House[] houses = new House[0];

		public City(String nameOfCity, House[] houses) {
				this.nameOfCity = nameOfCity;
				this.houses = houses;

		}

		@Override
		public String toString() {
				return  nameOfCity + " " + Arrays.toString(houses);

		}
}
