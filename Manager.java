
public class Manager extends Personnel {
	private int baseSalary = 1800;
	private int ssBenefits;
	
	@Override
	public void computeWage() {
		int owerWorkSalary = computeOverWorkSalary();

		setWage((baseSalary + (baseSalary * 135 / 100) + ((2016 - getYear_of_start()) * 16) + owerWorkSalary));
	}

	public int computeOverWorkSalary() {			// for computing overWorkSalary
		int salary = 0;
		for (int i = 0; i < 4; i++) {				// One month is equal to four weeks
			if (getWork_hour(i) >= 48) {			// Managers can work maximum 8 hours (40+8)
				salary = salary + (8 * 5);			// Each working hour they are paid 5 TL. 
			} else {
				salary = salary + ((getWork_hour(i) - 40) * 5);    // Each working hour they are paid 5 TL. 
			} 
		}
		return salary;
	}

	public int getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(int baseSalary) {
		this.baseSalary = baseSalary;
	}

	public int getSsBenefits() {
		return ssBenefits;
	}

	public void setSsBenefits(int ssBenefits) {
		this.ssBenefits = ssBenefits;
	}

}
