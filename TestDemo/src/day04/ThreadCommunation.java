package day04;

public class ThreadCommunation {
	public static void main(String[] args) {
		
		Person person = new Person();
		new Thread(new Producer(person)).start();
		new Thread(new Consumer(person)).start();
	}
	
	
}
