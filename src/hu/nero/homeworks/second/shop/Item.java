package hu.nero.homeworks.second.shop;

public class Item {
		private final int wight;
		private final String title;
		private Item [] items;

		public Item(int wight, String title) {
				this.wight = wight;
				this.title = title;

		}
		@Override
		public String toString() {
				return title;

		}
}
