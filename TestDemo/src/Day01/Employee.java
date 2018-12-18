package Day01;
import java.time.LocalDate;
import java.util.*;

public class Employee {
	private String name;
	private double salary;
	private LocalDate hireDay;
	public Employee (String name,double salary, int year,int month,int day) {
		this.name = name;
		this.salary = salary;
	    hireDay = LocalDate.of(year, month, day);
	}
	
	public String getName() {
		return name;
	}
	
	public double getSalary() {
		return salary;
	}
	
	public LocalDate getHireDay() {
		return hireDay;
	}
	
	public void raiseSalary(double byPercent) {
		this.salary += this.salary * byPercent / 100;
	}
}
