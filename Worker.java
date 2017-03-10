
public class Worker extends Full_Time {
	
	@Override
	public void computeWage() {
		int owerWorkSalary = computeOverWorkSalary();

		setWage((20 * 73 + ((2016 - getYear_of_start()) * 16) + owerWorkSalary));
	}

	public int computeOverWorkSalary() { 		// for computing overWorkSalary
		int salary = 0;
		for (int i = 0; i < 4; i++) {			// One month is equal to four weeks
			if (getWork_hour(i) >= 50) {		// Officers can work maximum 10 hours (40+10)
				salary = salary + (10 * 4);		// Each working hour they are paid 4 TL.
			} else {
				salary = salary + ((getWork_hour(i) - 40) * 4);	// Each working hour they are paid 4 TL.
			}
		}
		return salary;
	}
}
