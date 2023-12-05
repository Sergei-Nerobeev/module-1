package hu.nero.homeworks.second.office;

public class Staff {
		private final Boss boss;
		private final Manager manager;
		private final Secretary secretary;
		private final Guard guard;

		public Staff(Boss boss, Manager manager, Secretary secretary, Guard guard) {
				this.boss = boss;
				this.manager = manager;
				this.secretary = secretary;
				this.guard = guard;
		}

		public void staffPerform() {
				System.out.println(boss + ": " + manager + " быстрее!");
				System.out.println(manager + ":" + " я ничего не успеваю, помогите!");
				System.out.println(guard + ":" + " Дайте аванс!");
				System.out.println(secretary + ": " + boss + " не волнуйтесь," + manager + " все успеет. " + guard + " - подождите!");
		}
}




