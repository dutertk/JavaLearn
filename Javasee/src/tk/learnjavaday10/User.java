package tk.learnjavaday10;

public class User {
	String name;
	int age;
	float salary;
	long hairNum;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	public long getHairNum() {
		return hairNum;
	}
	public void setHairNum(long hairNum) {
		this.hairNum = hairNum;
	}
	public User(String name, int age, float salary, long hairNum) {
		super();
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.hairNum = hairNum;
	}
	@Override
	public String toString() {
		return "User [name=" + name + ", age=" + age + ", salary=" + salary + ", hairNum=" + hairNum + "]";
	}
	

}
