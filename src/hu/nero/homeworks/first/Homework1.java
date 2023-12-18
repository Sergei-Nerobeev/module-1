package hu.nero.homeworks.first;

import static hu.nero.homeworks.first.Homework1.ProfitCalculator.calculateProfitAfterTax;

public class Homework1
{
  public static void main(String[] args)
  {
    ex1();
    ex2();
    ex3();
    ex4();

  }

  public static void ex1()
  {
    String name = "     ПЕтРова Олег Иванович     ";
    System.out.println(name.trim());
    System.out.println(name.toUpperCase().trim());

    if (name.contains("ова "))
    {
      System.out.println("Уважаемая " + name.toUpperCase().trim());

    }
    else if (name.contains("ов "))
    {
      System.out.println("Уважаемый " + name.toUpperCase().trim());

    }
    else
    {
      System.out.println("Неизвестное лицо " + name);
    }
  }

  public static void ex2()
  {
    double fuel = 10;
    boolean isEngineWork = true;
    boolean hasErrors = false;
    boolean isWheelWork1 = true;
    boolean isWheelWork2 = true;
    boolean isWheelWork3 = true;
    boolean isWheelWork4 = true;

    if (fuel >= 10 && isEngineWork || (isWheelWork1 && isWheelWork2 && isWheelWork3 && isWheelWork4)
        && hasErrors)
    {
      System.out.println("Машина работает");
    }
    else
    {
      System.out.println("Машина не работает");
    }
  }

  public static void ex3()
  {
    String simply = "this is simply. This is my favorite song.";
    String modeString1 = simply.replaceAll("this is", "those are");
    String modeString2 = modeString1.replaceAll("This is", "those are");
    int indexSecondO = modeString2.indexOf("o", modeString2.indexOf("o") + 1);
    System.out.println(indexSecondO);
  }

  public static void ex4()
  {

    int sausageQty = 2000;
    int hamQty = 8511;
    int neckQty = 6988;
    double resultProfit = calculateProfitAfterTax(sausageQty, hamQty, neckQty);
    System.out.println("Прибыль после налогов: " + resultProfit + " руб.");
  }

  static class ProfitCalculator
  {
    private static int sausagePrice = 800;
    private static int sausageCost1 = 412;
    private static int sausageCost2 = 408;
    private static int sausageCost3 = 404;

    private static int hamPrice = 350;
    private static int hamCost = 275;

    private static int neckPrice = 500;
    private static int neckCost1 = 311;
    private static int neckCost2 = 299;

    public static double calculateProfitAfterTax(int sausageQty, int hamQty, int neckQty)
    {

      int totalIncome = (sausageQty * sausagePrice) + (hamQty * hamPrice) + (neckQty * neckPrice);

      int totalExpense =
          ((sausageQty * (sausageQty < 1000 ? sausageCost1 : (sausageQty < 2000 ? sausageCost2 : sausageCost3))) +
              (hamQty * hamCost) +
              (neckQty * (neckQty < 500 ? neckCost1 : neckCost2)) + 1_000_000);

      int profitBeforeTax = totalIncome - totalExpense;
      int tax = 0;

      if (profitBeforeTax > 2_000_000)
      {
        tax += (profitBeforeTax * 13 / 100);

      }
      else if (profitBeforeTax > 1_000_000 && profitBeforeTax < 2_000_000)
      {
        tax += (profitBeforeTax * 10 / 100);

      }
      else if (profitBeforeTax < 1_000_000)
      {
        tax += (profitBeforeTax * 8 / 100);
      }
      return profitBeforeTax - tax;
    }
  }
}

