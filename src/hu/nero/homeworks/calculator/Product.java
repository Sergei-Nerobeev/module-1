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

	// расчет себестоимости
	public void getCost(String title, int quantity) {
		int costRate = 412;
		int expense = 0;
		if(title.contains("Sausage") && quantity < 2000){
			expense = costRate * quantity;
			System.out.println("Количество " + title +  " > 1000, себестоимость равна: " + costRate + " Расход равен: " + expense);

		} else if(title.contains("sausage") && quantity > 1000 && quantity < 2000){
			System.out.println("Себестоимость > 1000 и < 2000");
		}

	}

	// расчет чистого дохода
	public int totalCalculateProfit(){
		int result = this.price * this.quantity;
		System.out.println("Доход по " + this.title + " равен: " + result);
		return result;
	}

	// расчет расхода
	public int totalCalculateExpense(){
		int result = this.cost * this.quantity;       // 1_000_000 прибавляется к сумме всех издержек
		System.out.println("Расход по " + this.title + " равен: " + result);
		return result;
	}

	// расчет прибыли до вычета налогов
	public void profitBeforeTax(){
		int profit = totalCalculateProfit();
		int expense = totalCalculateExpense();
		int netProfit = (profit - expense);
		System.out.println("Прибыль по " + this.title + " равна: " + netProfit);
	}

	// расчет прибыли после вычета налогов
	public void profitAfterTax(){

		int profit = totalCalculateProfit();
		int expense = totalCalculateExpense();
		int netProfit = (profit - expense);
		System.out.println("Чистая прибыль по товару " + this.title + " равна: " + netProfit);

		int taxRate;
		int taxTotal;
		if(netProfit <= 1_000_000) {
				taxRate = 8;
				taxTotal = netProfit * taxRate / 100;
				System.out.println("Налог с чистой прибыли " + netProfit + " по товару " + title + " при ставке " + taxRate + " составил: " + taxTotal);

		} else if(netProfit >= 1_000_001 && netProfit < 2_000_000) {
			  taxRate = 10;
				taxTotal = netProfit + taxRate / 100;
			  System.out.println("Налог с чистой прибыли " + netProfit + " по товару " + title + " при ставке " + taxRate + " составил: " + taxTotal);

		} else if (netProfit > 2_000_000) {
				taxRate = 13;
				taxTotal = netProfit + taxRate / 100;
				System.out.println("Налог с чистой прибыли " + netProfit + " по товару " + title + " при ставке " + taxRate + " составил: " + taxTotal);
		}
		}




	}






