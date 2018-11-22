package tk.learnjavaday03;

public class Employee {
	String id;
	String name;
	float salary;
	//有参构造方法 构造一个对象时执行的初始化逻辑
	public Employee(String p1, String p2, float p3) {
	this.id = p1;
	this.name = p2;
	this.salary = p3;
	}
}
