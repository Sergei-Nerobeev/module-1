package hu.nero.homeworks.third.ex1.hardwood;

import hu.nero.homeworks.third.ex1.Three;

public class Hardwood extends Three
{
  protected String titleOfTree;
  protected boolean hasLeaves;

  public Hardwood(String titleOfTree, int threeAge, boolean hasLeaves)
  {
    super(threeAge);
    this.titleOfTree = titleOfTree;
    this.hasLeaves = hasLeaves;
  }

  public boolean isHasLeaves()
  {
    return hasLeaves;
  }

  public void bloom()
  {
    if (!hasLeaves)
    {
      hasLeaves = true;
      System.out.println(titleOfTree + " - дерево цветет");
    }
    else
    {
      System.out.println("На " + titleOfTree + "- дерево отцвело и уже есть листья");
    }
  }

  public void sheLeaves()
  {
    if (hasLeaves)
    {
      hasLeaves = false;
      System.out.println(titleOfTree + "- дерево теряет листья");
    }
    else
    {
      System.out.println(titleOfTree + "- дерево уже без листьев.Листьев нет");
    }
  }
}
