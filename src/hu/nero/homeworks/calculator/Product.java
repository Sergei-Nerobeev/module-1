package hu.nero.homeworks.calculator;

public abstract class Product {
  protected final String title;
	protected final int price;
	protected final int cost;
	protected final int quantity;

	public Product(String title, int price, int cost, int quantity) {
		this.title = title;
		this.price = price;
		this.cost = cost;
		this.quantity = quantity;
	}

	// расчет чистого дохода
	public int totalCalculateProfit(){
		int result = this.price * this.quantity;
		System.out.println("Доход по " + this.title + " равен: " + result);
		return result;
	}

	// расчет расхода
	public int totalCalculateExpense(){
		int result = this.cost * this.quantity; // 1_000_000 прибавляется к сумме всех издержек
		System.out.println("Расход по " + this.title + " равен: " + result);
		return result;
	}

	// расчет прибыли до вычета налогов
	public void profitBeforeTax(){
		int profit = totalCalculateProfit();
		int expense = totalCalculateExpense();
		int result = (profit - expense);
		System.out.println("Прибыль по " + this.title + " равна: " + result);
	}





}
