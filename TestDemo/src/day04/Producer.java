package day04;

public class Producer implements Runnable{
	Person person = null;
	
	public Producer(Person person) {
		this.person = person;
	}
	
	@Override
	public void run() {
		int i = 0;
		while(true) {
			if (i == 0) 
				try {
					person.put("米兰", "男");
				}
			catch(Exception exception) {
				System.out.println(exception.getMessage());
			}
				
			else 
				try {
					person.put("国际", "女");
				}
			catch(Exception exception) {
				System.out.println(exception.getMessage());
			}
				
			i = (i+1)%2;
		}
		
	}

}
