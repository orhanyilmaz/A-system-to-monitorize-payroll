
public class Security extends Personnel {
	private int transMoney = 4;
	private int foodMoney = 5;
	
	@Override
	public void computeWage() {
		int salary = 0;
		for (int i = 0; i < 4; i++) {			// One month is equal to four weeks
			if (getWork_hour(i) >= 54) {		// Security can work maximum 54 hours 
				setWork_hour(54, i);
				salary = salary + getWork_hour(i) * 65 / 10;	// Each working hour they are paid 6,5 TL. 
			} else if (getWork_hour(i) >= 30 && getWork_hour(i) < 54) {	// Security can work maximum 54 hours minimum 30 hours
				salary = salary + getWork_hour(i) * 65 / 10;	// Each working hour they are paid 6,5 TL. 
			} else if (getWork_hour(i) < 30) {			// if they worked less then 30 hours 
				;										//they are paid 0 TL
			}
		}
		setWage((salary + 96 + 120 + (2016 - getYear_of_start()) * 16));
	}

	public int getFoodMoney() {
		return foodMoney;
	}

	public void setFoodMoney(int foodMoney) {
		this.foodMoney = foodMoney;
	}

	public int getTransMoney() {
		return transMoney;
	}

	public void setTransMoney(int transMoney) {
		this.transMoney = transMoney;
	}
}
