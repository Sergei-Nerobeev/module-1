package hu.nero.homeworks.second.shop;

import java.util.Arrays;

public class Shop {

		private Worker [] workers;

		public Shop() {
				this.workers = new Worker[2];
		    this.workers [0] = new Worker("Василий", 30, "Мужчина");
				this.workers [1] = new Worker ("Марьяна", 25, "Женщина");
		}

		public void getPrintWorkers() {
				System.out.println(Arrays.toString(workers));


		}

}
