package hu.nero.homeworks.third.ex1.hardwood;

public class Birch extends Hardwood{
		public Birch(String titleOfTree, int threeAge, boolean hasLeaves) {
				super(titleOfTree, threeAge, hasLeaves);
		}
		public void printAllergen() {
				System.out.println("Источает аллергены");
		}
}
