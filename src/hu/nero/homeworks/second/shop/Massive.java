package hu.nero.homeworks.second.shop;

public class Massive {

		public static void main(String[] args) {
				int [] numbers = {1,2,3,4,5,6,7,8,9};
				for(int i = 0, j = numbers.length - 1; i < j ; i++, j--) {
						int temp = numbers[i];
						numbers[i] = numbers[j];
						numbers[j] = temp;

				}
				for (int number : numbers)
						System.out.print(number + " ");


				int a = 10;
				int b = 5;
				int temp = a;
				a = b;
				b = temp;
				System.out.println(a);
				System.out.println(b);
				System.out.println(a);
				System.out.println(b);

		}
}
