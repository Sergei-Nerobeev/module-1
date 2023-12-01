package hu.nero.homeworks.second.office;

public class Staff {
		private final Boss boss;
		private final Manager manager;
		private final Secretary secretary;
		private final Guard guard;

		public Staff(Boss boss, Manager manager,Secretary secretary, Guard guard) {
				this.boss = boss;
				this.manager = manager;
				this.secretary = secretary;
				this.guard = guard;
		}

		public void performBoss() {
				if(boss != null) {
						System.out.println(boss + ":" + manager + "быстрее!");
				} else {
						System.out.println("Error!");
				}
		}
		public void performManager() {
				if(manager != null) {
						System.out.println(manager + ":" + " я ничего не успеваю, помогите!");
				} else {
						System.out.println("Error!");
				}
		}
		public void performSecretary() {
				if(secretary != null) {
						System.out.println(boss + "не волнуйтесь," + manager + "все успеет." + guard + "- подождите!");
				} else {
						System.out.println("Error!");
				}
		}
		public void performGuard() {
				if(secretary != null) {
						System.out.println(guard + ":" + " Дайте аванс!");
				} else {
						System.out.println("Error!");
				}
		}


}
