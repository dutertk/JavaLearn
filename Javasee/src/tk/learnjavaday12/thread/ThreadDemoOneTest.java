package tk.learnjavaday12.thread;

public class ThreadDemoOneTest {
	public static void main(String[] args) {
		ThreadDemoOne threadDemoOne = new ThreadDemoOne();
		
		Thread threadOne = new Thread(threadDemoOne);
		Thread threadTwo = new Thread(threadDemoOne);
		Thread threadThree = new Thread(threadDemoOne);
		Thread threadFour = new Thread(threadDemoOne);
		Thread threadFive= new Thread(threadDemoOne);
		
		threadOne.start();
		threadTwo.start();
		threadThree.start();
		threadFour.start();
		threadFive.start();
	}
}
