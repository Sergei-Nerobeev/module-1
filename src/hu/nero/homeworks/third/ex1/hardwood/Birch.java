package hu.nero.homeworks.third.ex1.hardwood;

public class Birch extends Hardwood {
public Birch(String titleOfTree, int threeAge, boolean hasLeaves) {
		super(titleOfTree, threeAge, hasLeaves);
		if (hasLeaves) {
				System.out.println(titleOfTree + " источает аллергены");
		}
}

public int getThreeAge() {
		return super.getThreeAge();
}

}
