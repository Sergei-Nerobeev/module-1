package hu.nero.homeworks.third.ex2;

public class Smartphone {
		private final String model;
		private Os os;
		private Board board;
		private Camera camera;

		public Smartphone(String model) {
				this.model = model;
		}

		public void buildSmartPhone(Os os, Board board, Camera camera) {
				this.os = os;
				this.board = board;
				this.camera = camera;
		}

		public void printDetails() {
				System.out.println("Модель телефона: " + model);
				System.out.println("Операционная система: " + os.getModel());
				System.out.println("Плата: " + board.getModel() + " размер: " + board.getSize());
				System.out.println("Камера: " + camera.getModel() + " зум: " + camera.getZoom() + " вспышка: "
						+ camera.isHasFlash());
		}

}
