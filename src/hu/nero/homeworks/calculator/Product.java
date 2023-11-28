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
	public int getCost(String title, int quantity) {
		int costRate = 412;
		int expense = 0;
		if (title.contains("Sausage") && quantity < 2000) {
			expense = costRate * quantity;
			System.out.println("Количество " + title + " > 1000 кг. Cебестоимость равна: " + costRate + " Расход равен: " + expense);

		} else if (title.contains("Sausage") && quantity > 1000 && quantity <= 2000) {
			expense = (costRate - 4) * quantity;
			System.out.println("Количество " + title + " > 1000 кг. и < 2000 кг. Cебестоимость равна: " + (costRate - 4) + " Расход равен: " + expense);

		} else if (title.contains("Sausage") && quantity > 2000) {
			expense = (costRate - 8) * quantity;
			System.out.println("Количество " + title + " >  2000 кг. Cебестоимость равна: " + (costRate - 8) + " Расход равен: " + expense);

		} else if (title.contains("Ham")) {
			expense = (costRate - 137) * quantity;
			System.out.println("Количество " + title + "." + " Себестоимость равна: " + (costRate - 137) + " Расход равен: " + expense);

		} else if (title.contains("Neck") && quantity < 500) {
			expense = (costRate - 101) * quantity;
			System.out.println("Количество " + title + " < 500 кг. Cебестоимость равна: " + (costRate - 101) + " Расход равен: " + expense);

		} else if (title.contains("Neck") && quantity >= 500) {
			expense = (costRate - 113) * quantity;
			System.out.println("Количество " + title + " >= 500 кг. Cебестоимость равна: " + (costRate - 101) + " Расход равен: " + expense);
		}

			return expense;
		}


	// расчет чистого дохода
	public int totalCalculateProfit(){
		int profit = this.price * this.quantity;
		System.out.println("Доход по " + this.title + " равен: " + profit);
		return profit;
	}

	// расчет расхода
	public int totalCalculateExpense(){
		int expense = this.cost * this.quantity;       // 1_000_000 прибавляется к сумме всех издержек
		System.out.println("Расход по " + this.title + " равен: " + expense);
		return expense;
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






