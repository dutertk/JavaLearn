package day01;

import java.util.*;

public class ManagerTest {

	public static void main(String[] args) {
		Manager manager = new Manager("Carl Cracker", 8000, 1987, 12, 15);
		manager.setBonus(5000);
		
		Employee[] employees = new Employee[3];
		employees[0] = manager;
		employees[1] = new Employee("Harry Hacker", 5000, 1989, 10, 1);
		employees[2] = new Employee("Tony Tester", 4000, 1990, 3, 15);
		for(Employee employee : employees) 
			System.out.println(employee.getName() + "->> " + employee.getSalary());

	}

}
