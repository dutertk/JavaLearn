package queue;

public class TestQueue {
	public static void main(String[] args) {
		Queue queue = new Queue(5);
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
	}

}
