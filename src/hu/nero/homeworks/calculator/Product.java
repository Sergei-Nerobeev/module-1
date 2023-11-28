package hu.nero.homeworks.calculator;

public abstract class Product {
  protected String title;
	protected int price;
	protected int cost;
	protected int quantity;
	protected int result;

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
		int netProfit = (profit - expense);
		System.out.println("Прибыль по " + this.title + " равна: " + result);
	}

	public void profitAfterTax(){
		int taxRate;
		int taxTotal;
		int profit = totalCalculateProfit();
		int expense = totalCalculateExpense();
		int netProfit = (profit - expense);

		if(netProfit > 1_000_000) {
				taxRate = 13;
				taxTotal = netProfit * taxRate / 100;
				System.out.println("Налог: " + taxTotal);

		}
		}




	}






