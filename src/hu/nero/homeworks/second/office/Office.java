package hu.nero.homeworks.second.office;

public class Office {
		private Staff staff;

		public void workDay(){
				Staff staff = new Staff(new Boss("Петр Николаевич"),new Manager("Володя"),new Secretary(),
						new Guard("Петрович"));
				staff.staffPerform();

		}

}
