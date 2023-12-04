package hu.nero.homeworks.second.shop;

import java.util.Arrays;

public class Worker {
		private final String name;
		private final int age;
		private final String gender;
		private Item [] items;

		public Worker(String name, int age, String gender) {
				this.name = name;
				this.age = age;
				this.gender = gender;
		}

		public Worker(String name, int age, String gender, Item[] items) {
				this.name = name;
				this.age = age;
				this.gender = gender;
				this.items = items;
		}

		@Override
		public String toString() {
				return "{" +
						"name='" + name + '\'' +
						", age=" + age +
						", gender='" + gender + '\'' + '}';

		}

		public void shoutAboutItems(Item [] items) {
				System.out.println(this.name + " :" + " смотрите какая у меня вещь - " + Arrays.toString(items));
		}


}
