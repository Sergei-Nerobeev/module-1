package hu.nero.homeworks.second.shop;

import java.util.Arrays;

public class Shop {

		private Worker [] worker;

		public Shop(Worker [] worker) {
				this.worker = new Worker[2];
		}

		public void getPrintWorkers(Worker [] worker) {
				System.out.println(Arrays.toString(worker));


		}

}
