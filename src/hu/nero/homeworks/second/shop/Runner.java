package hu.nero.homeworks.second.shop;

public class Runner {
		public static void main(String[] args) {
				Item  hammer = new Item(1000,"Молот");
				Item screwdriver = new Item(50,"Отвертка");
				Item notebook = new Item(30,"Тетрадка");
				Item pen = new Item(10,"Ручка");

				Worker worker1 = new Worker("Василий",30,"Мужчина");
				Worker worker2 = new Worker("Марьяна",25,"Женщина");

				Shop shop = new Shop();
				shop.getPrintWorkers();

				Item [] itemsOfMan = new Item[2];
				itemsOfMan [0] = hammer;
				itemsOfMan [1] = screwdriver;
				Item [] itemsOfWoman = new Item[2];
				itemsOfWoman [0] = notebook;
				itemsOfWoman [1] = pen;

				worker1.shoutAboutItem(itemsOfMan);
				worker2.shoutAboutItem(itemsOfWoman);



		}
}
