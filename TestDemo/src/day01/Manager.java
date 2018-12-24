package day01;

public class Manager extends Employee {
	
	public Manager(String name, double salary, int year, int month, int day) {
		super(name, salary, year, month, day);
		bonus = 0;
	}

	private double bonus;
	
	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	public double getSalary() {
		double basesalary = super.getSalary();
		return basesalary + bonus;
	}
}
