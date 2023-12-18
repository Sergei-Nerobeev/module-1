package hu.nero.homeworks.third.ex1;

import hu.nero.homeworks.third.ex1.hardwood.Birch;
import hu.nero.homeworks.third.ex1.softwood.Pine;
import hu.nero.homeworks.third.ex1.softwood.Spruce;

public class Runner
{
  public static void main(String[] args)
  {
    Pine pine = new Pine(100, true);
    Birch birch = new Birch("Birch", 10, true);
    Spruce spruce = new Spruce(200, false);
    Three[] threes = {pine, birch, spruce};

    int totalAge = 0;
    for (Three three : threes)
    {
      totalAge += three.getThreeAge();
    }
    int average = totalAge / threes.length;
    System.out.println("Средний возраст деревьев: " + average);

  }
}
