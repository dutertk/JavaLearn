package day04;

public class Consumer implements Runnable {
	Person person = null;
	
	public Consumer(Person person) {
		this.person = person;
	}

	@Override
	public void run() {
		while(true) {
			
			try {
				person.get();	
			}
			catch(Exception exception) {
				System.out.println(exception.getMessage());
			}
		}
		
	}
	


}
