package day04;


public class Person {
	private String name;
	private String sex;
	boolean bFlag = false;
	public synchronized void put(String name, String sex) throws Exception{
		if (bFlag) 
			//特别注意：如果条件语句的代码块中只有一句话，就可以省略大括号了！！
			//这里就是相当于{wait()}
			wait();
			this.name = name;
			this.sex = sex;
			bFlag = true;
			notify();
		
		
	}
	
	public synchronized void get() throws Exception {
		if (!bFlag) 
			//特别注意：如果条件语句的代码块中只有一句话，就可以省略大括号了！！
			//这里就是相当于{wait()}
			wait();
			System.out.println(this.name + "-->>" + this.sex);
			bFlag = false;
			notify();
		
		
	}
	
}
