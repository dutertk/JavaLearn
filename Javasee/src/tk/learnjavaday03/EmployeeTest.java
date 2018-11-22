package tk.learnjavaday03;

public class EmployeeTest {
	public static void main(String[] args) {
		Employee employee1 = new Employee("1", "t", 892.3f);
	    Employee employee2 = new Employee("2", "p", 589.3f);
	    Employee[] arrayEmployee = new Employee[2];
	    arrayEmployee[0] = employee1;
	    arrayEmployee[1] = employee2;
	    for (int i = 0; i < arrayEmployee.length-1; i++) {
			if (arrayEmployee[i].salary > arrayEmployee[i+1].salary) {
				Employee temp = arrayEmployee[i];
				arrayEmployee[i] = arrayEmployee[i+1];
				arrayEmployee[i+1] = temp;
			}
		}
	    System.out.println("最高工资为：" + arrayEmployee[arrayEmployee.length-1].name
	    		+"其薪水：" + arrayEmployee[arrayEmployee.length-1].salary);
	}

}
