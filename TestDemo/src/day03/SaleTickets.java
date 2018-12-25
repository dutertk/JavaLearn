package day03;

/**
 * 
 * 多线程售票
 * 
 * @author tangkai
 *
 */

public class SaleTickets {
	public static void main(String[] args) {
		Tickets tickets = new Tickets();

		new Thread(tickets).start();
		new Thread(tickets).start();
		new Thread(tickets).start();
		new Thread(tickets).start();

	}

}

class Tickets implements Runnable {
	private int ticket = 100;
	// 修改当前的售票类
	String str = "";

	public void run() {

		while (true) {
			/**
			 * 为了解决线程同步的问题，即保证线程安全（代码的原子性） 将需要具有原子性的代码，放入synchronized语句，形成同步代码块
			 */
			synchronized (str) {

				// 在这段代码中会出现同一张票号被打印出多次甚至出现负数的票号
				if (ticket > 0) {
					try {
						/**
						 * 线程执行到该处后会暂停执行，让出cpu给别的线程 在指定的时间以后，cpu会回到刚才暂停的线程上继续执行。 这里就看到了重复的票号
						 */
						Thread.sleep(10);
					} catch (Exception e) {
						System.out.println(e.getMessage());
					}
					System.out.println(Thread.currentThread().getName() + " is selling tickets " + ticket--);
				}
			}
		}
	}

}
