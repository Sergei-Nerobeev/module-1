package hu.nero.homeworks.second.shop;

import java.util.Arrays;

public class Worker {
		private String name;
		private int age;
		private String gender;
		private Item [] items;

		public Worker(String name, int age, String gender) {
				this.name = name;
				this.age = age;
				this.gender = gender;
		}

		@Override
		public String toString() {
				return "{" +
						"name='" + name + '\'' +
						", age=" + age +
						", gender='" + gender + '\'' + '}';

		}

		public void shoutAboutItem(Item [] items) {
//				for (Item item : items) {
				System.out.println(this.name + " :" + " смотрите какая у меня вещь " + Arrays.toString(items));
//				}

		}


}