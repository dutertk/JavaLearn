package queue;

public class TestMyQueue {
	public static void main(String[] args) {
		MyQueue queue = new MyQueue(5);
		System.out.println(queue.isEmpty());
		queue.insert(50);
		queue.insert(80);
		queue.insert(10);
		queue.insert(4);
		queue.insert(11);
		
		System.out.println(queue.isFull());
		while(!queue.isEmpty()) {
			
			System.out.println(queue.remove());
		}
		
		System.out.println(queue.isEmpty());
	}
	
	

}
