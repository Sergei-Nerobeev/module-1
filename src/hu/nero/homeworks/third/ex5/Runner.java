package hu.nero.homeworks.third.ex5;

public class Runner {
public static void main(String[] args) {
	House house1 = new House("Rue de Passy", 35);
	House house2 = new House("Rue de Boissiere", 112);
	House house3 = new House("Avenue Kleber", 10);

	House[] houses = new House[]{house1, house2, house3};
	City city1 = new City("Paris", houses);
	System.out.println(city1);
}
}
