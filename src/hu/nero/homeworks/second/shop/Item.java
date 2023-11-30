package hu.nero.homeworks.second.shop;

public class Item {

		private int wight;
		private String title;

		public Item(int wight, String title) {
				this.wight = wight;
				this.title = title;
		}

		@Override
		public String toString() {
				return "{" +
						"wight=" + wight +
						", title='" + title + '\'' +
						'}';
		}
}
