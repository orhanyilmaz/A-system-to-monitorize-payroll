
public class Part_Time extends Employee {
	private int hourOfWork;
	
	@Override
	public void computeWage() {
		int salary = 0;
		for (int i = 0; i < 4; i++) {		// One month is equal to four weeks
			if (getWork_hour(i) >= 20) {	// Part-time employees can work maximum 20 hours
				salary = salary + 20 * 12;	// Each working hour they are paid 12 TL. 
			} else if (getWork_hour(i) < 20 && getWork_hour(i) >= 10) {		// Part-time employee can work maximum 20 hours minimum 10 hours
				salary = salary + getWork_hour(i) * 12;		// Each working hour they are paid 12 TL. 
			} else if (getWork_hour(i) < 10) {	// if they worked less then 30 hours 
				;								//they are paid 0 TL
			}
		}
		setWage(salary);
	}

	public int getHourOfWork() {
		return hourOfWork;
	}

	public void setHourOfWork(int hourOfWork) {
		this.hourOfWork = hourOfWork;
	}
}
