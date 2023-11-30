package hu.nero.homeworks.second.shop;

public class Runner {
		public static void main(String[] args) {

				Item [] itemsOfMan = new Item[2];
				itemsOfMan [0] = new Item(1000,"Молот");
				itemsOfMan [1] = new Item(50,"Отвертка");

				Item [] itemsOfWoman = new Item[2];
				itemsOfWoman [0] = new Item(30,"Тетрадка");
				itemsOfWoman [1] = new Item(10,"Ручка");

				Worker worker1 = new Worker("Василий",30,"Мужчина",itemsOfMan);
				Worker worker2 = new Worker("Марьяна",25,"Женщина",itemsOfWoman);

				Worker [] workers = new Worker[2];
				workers [0] = worker1;
				workers [1] = worker2;
				for(Worker el : workers) {

				}

				Shop shop = new Shop(workers);
				shop.getPrintWorkers(workers);

				worker1.shoutAboutItem(itemsOfMan);
				worker2.shoutAboutItem(itemsOfWoman);


		}
}
