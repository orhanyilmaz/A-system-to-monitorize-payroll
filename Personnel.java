import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Personnel {

	private int overWorkSalary;
	private String name;
	private String surname;
	private String registerNumber;
	private String position;
	private int year_of_start;
	private int wage;
	private int[] work_hour = new int[4];			// this array variable is for keep hour info ..

	public void computeWage() {							// i didn't wrote in here anything because this func is not common for  any class
		
											
	}
	
	public void writeTxt() {

		try {
			File file = new File(registerNumber + ".txt");
			FileWriter writer = new FileWriter(file);
			BufferedWriter write = new BufferedWriter(writer);
			write.write("Name : " + name);
			write.newLine();
			write.newLine();
			write.write("Surname : " + surname);
			write.newLine();
			write.newLine();
			write.write("Registiration Number : " + registerNumber);
			write.newLine();
			write.newLine();
			write.write("Position : " + position);
			write.newLine();
			write.newLine();
			write.write("Year of Start : " + year_of_start);
			write.newLine();
			write.newLine();
			write.write("Total Salary : " + String.format(java.util.Locale.US, "%.2f", (float) wage) + " TL");
			write.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void setWage(int wage) {
		this.wage = wage;
	}

	public int getOverWorkSalary() {
		return overWorkSalary;
	}

	public void setOverWorkSalary(int overWorkSalary) {
		this.overWorkSalary = overWorkSalary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getRegisterNumber() {
		return registerNumber;
	}

	public void setRegisterNumber(String registerNumber) {
		this.registerNumber = registerNumber;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public int getYear_of_start() {
		return year_of_start;
	}

	public void setYear_of_start(int year_of_start) {
		this.year_of_start = year_of_start;
	}

	public int getWork_hour(int i) {
		return work_hour[i];
	}

	public void setWork_hour(int work_hour, int i) {
		this.work_hour[i] = work_hour;
	}
}
